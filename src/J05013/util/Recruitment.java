package J05013.util;

import java.math.*;
public class Recruitment implements Comparable<Recruitment>{
    private String  id, name, status;
    private double theory , practice, average;

    public Recruitment( int i , String name, double theory, double practice) {
        this.id = "TS" + String.format("%02d", i);
        this.name = name;
        this.theory = (theory > 10) ? theory / 10 : theory;
        this.practice = (practice > 10) ? practice / 10 : practice;
        this.average = Math.round((this.theory + this.practice)/2 * 100.00) /100.00;
        if(this.average < 5) this.status = "TRUOT";
        else if(this.average < 8) this.status = "CAN NHAC";
        else if(this.average <= 9.5) this.status = "DAT";
        else this.status = "XUAT SAC";
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + String.format("%.2f", average) + " " + status  ;
    }
    

    @Override
    public int compareTo(Recruitment o) {
        if(this.average < o.average) return 1;
        return -1;
    }
}
