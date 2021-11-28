
package J07053.util;

import java.util.*;
import java.text.*;
import java.math.*;

public class Candidate {
    private String id,name,rank;
    private Date yob;
    private double theory, pratice, average, bonus;
    private long realMark, age;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    public Candidate(int i,String name, String yob, double theory, double pratice) throws ParseException {
        this.id = "PH" + String.format("%02d", i);
        this.name = "";
        String s[] = name.trim().toLowerCase().split("\\s+");
        for(String x : s){
            this.name = this.name + x.substring(0,1).toUpperCase()+ x.substring(1) + " ";
        }
        this.yob = format.parse(yob);
        this.theory = theory;
        this.pratice = pratice;
        if(this.theory >= 8 && this.pratice >= 8){
            this.bonus = 1;
        }
        else if(this.theory >= 7.5 && this.pratice >= 7.5){
            this.bonus = 0.5;
        }
        else this.bonus = 0; 
        this.average= (this.theory + this.pratice)/2 + this.bonus;
        this.realMark = (Math.round(this.average)*10)/10;
                ;
        if(this.realMark > 10) this.realMark = 10;
        if(this.realMark >= 9) this.rank ="Xuat sac";
        else if(this.realMark == 8) this.rank = "Gioi";
        else if(this.realMark == 7) this.rank ="Kha";
        else if(this.realMark==5 || this.realMark == 6) this.rank = "Trung binh";
        else if(this.realMark < 5) this.rank ="Truot";
        this.age =  121 - this.yob.getYear(); 
    }

    @Override
    public String toString() {
        return  id + " " + name+ age+ " " + realMark + " " + rank ;
    }
    
}
