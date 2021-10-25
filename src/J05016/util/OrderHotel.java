
package J05016.util;

import java.text.*;
import java.util.*;


public class OrderHotel implements Comparable<OrderHotel>{
    private String id, name, idRoom ;
    private Date dateIn, dataOut;
    private long serviceFee, totalDay, totalPay, cost;
    private static HashMap<String, Integer> store = new HashMap<>();

    public OrderHotel(int i , String name,String idRoom, String dateIn, String dataOut,  long serviceFee) throws ParseException {
        this.id = "KH" + String.format("%02d", i);
        this.name = name;
        this.dateIn = new SimpleDateFormat("dd/MM/yyyy").parse(dateIn);
        this.dataOut = new SimpleDateFormat("dd/MM/yyyy").parse(dataOut);
        long diff = this.dataOut.getTime() - this.dateIn.getTime();
        this.totalDay = diff/(24 * 3600000) + 1;
        this.idRoom = idRoom;
        this.serviceFee = serviceFee;
        this.cost = store.get(this.idRoom.substring(0,1));
        this.totalPay = this.cost * this.totalDay + this.serviceFee;
    }
    
    public static void getStore(){
       store.put("1", 25);
       store.put("2", 34);
       store.put("3", 50);
       store.put("4", 80);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + idRoom + " " + totalDay + " " + totalPay;
    }

    @Override
    public int compareTo(OrderHotel o) {
        if(this.totalPay < o.totalPay) return 1 ;
        return -1;
    }
}

