package J07049.util;

import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Clients implements Comparable<Clients>{
    private String idClient, name, address, idProduct;
    private int count, totalPay;
    private LocalDate dayBuy, datDate;
    private Products x;
    private Date comp;
    
    SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
    public Clients(int i, String name, String address, String idProduct, int count, String dayBuy) throws ParseException {
        this.idClient = "KH" + String.format("%02d", i);
        this.name = name;
        this.address = address;
        this.idProduct = idProduct;
        this.count = count;
        this.dayBuy = LocalDate.parse(format1.format(format2.parse(dayBuy)));
    }

    public void setX(Products x) throws ParseException {
        this.x = x;
        this.totalPay = this.count* this.x.getCost();
        this.datDate = this.dayBuy.plusMonths(this.x.getDate());
        this.comp = format1.parse(this.datDate.toString());
    }

    public String getIdProduct() {
        return idProduct;
    }

    @Override
    public String toString() {
        String y = "";
        try {
            y = format2.format(format1.parse(this.datDate.toString()));
        } catch (ParseException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  idClient + " " + name + " " + address + " " + idProduct + " " + totalPay + " " + y;
    }

    @Override
    public int compareTo(Clients o) {
        if (this.comp.getTime() > o.comp.getTime()) return 1;
        else if(this.comp.getTime()==o.comp.getTime()) return this.idClient.compareTo(o.idClient);
        return -1;
    } 
}
