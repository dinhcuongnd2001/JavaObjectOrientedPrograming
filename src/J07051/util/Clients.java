
package J07051.util;

import java.util.*;
import java.text.*;

public class Clients implements Comparable<Clients>{
    private String id, name, idRoom;
    private Date dayIn, dayOut;
    private long servicePay, costRoom, totalPay,totalDay;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private static HashMap<String , Integer> cost = new HashMap<>();

    public Clients(int i, String name, String idRoom, String dayIn, String dayOut, long servicePay) throws ParseException {
        this.id = "KH"+ String.format("%02d", i);
        this.name = "";
        String s[] = name.toLowerCase().trim().split("\\s+");
        for(String x : s){
            this.name = this.name + x.substring(0,1).toUpperCase() + x.substring(1) + " ";
        }
        this.idRoom = idRoom;
        this.dayIn = format.parse(dayIn);
        this.dayOut = format.parse(dayOut);
        this.servicePay = servicePay;
        this.costRoom = cost.get(this.idRoom.subSequence(0, 1));
        this.totalDay = (this.dayOut.getTime() - this.dayIn.getTime())/(24*60*60*1000) + 1;
        this.totalPay = this.costRoom* totalDay + this.servicePay;
    }
    
    public static void creatCost(){
        cost.put("1", 25);
        cost.put("2", 34);
        cost.put("3", 50);
        cost.put("4", 80);
    }

    @Override
    public int compareTo(Clients o) {
        return (int)(o.totalPay - this.totalPay);
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + idRoom + " " + totalDay+ " " + totalPay  ;
    }
    
}
