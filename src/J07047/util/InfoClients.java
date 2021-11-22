package J07047.util;

import java.util.Date;
import java.text.*;

public class InfoClients implements Comparable<InfoClients>{
    private String id, name, idRoom;
    private Date dayIn, dayOut;
    private long totalDay, discount;
    private double totalPay;
    private Rooms r;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public InfoClients(int i, String name, String idRoom, String dayIn, String dayOut) throws ParseException {
        this.id = "KH" + String.format("%02d", i);
        this.name = name;
        this.idRoom = idRoom;
        this.dayIn = format.parse(dayIn);
        this.dayOut = format.parse(dayOut);
        this.totalDay = (this.dayOut.getTime() - this.dayIn.getTime()) / (24*1000*60*60);
        if(this.totalDay < 10) this.discount = 0;
        else if(this.totalDay < 20)this.discount = 2;
        else if(this.totalDay < 30) this.discount = 4;
        else this.discount = 6;
    }

    public String getIdRoom() {
        return idRoom.substring(2,3);
    }

    public void setR(Rooms r) {
        long dayPay = 1 ;
        this.r = r;        
        if(this.totalDay > 1) dayPay = this.totalDay; 
        this.totalPay = (this.r.getCost())*dayPay + (this.r.getCost())*dayPay * this.r.getServicePay();
        this.totalPay = this.totalPay*(100-this.discount)/100;
        this.totalPay = Math.round(this.totalPay * 100.0) /100.0;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + idRoom + " " + totalDay + " " + String.format("%.2f",totalPay);
    }

    @Override
    public int compareTo(InfoClients o) {
        if(this.totalDay < o.totalDay) return 1;
        return -1;
    }
    
}
