
package J05061.util;

import java.math.*;
public class ResultsTest implements Comparable<ResultsTest>{
    private String id, name, dOb , status ;
    private double theory, practice, bonus, total;
    private int age;

    public ResultsTest(int i, String name, String dOb, double theory, double practice) {
        this.id = "PH" + String.format("%02d", i);
        this.name = name;
        this.dOb = dOb;
        this.theory = theory;
        this.practice = practice;
        if(this.theory >= 8 && this.practice >= 8) this.bonus = 1;
        else if(this.theory >= 7.5 && this.practice >= 7.5) this.bonus = 0.5;
        else this.bonus = 0 ;
        this.total = (this.theory + this.practice) /2 + this.bonus;
        this.total = Math.round(this.total) ;
        if(this.total > 10) this.total = 10;
        if(this.total < 5) this.status = "Truot";
        else if(this.total <=6) this.status = "Trung binh";
        else if(this.total == 7) this.status = "Kha";
        else if(this.total == 8) this.status = "Gioi";
        else this.status = "Xuat sac";
        this.age  = 2021 -  Integer.parseInt(this.dOb.substring(6,10));
    }
    @Override
    public String toString() {
        return  id + " " + name + " " + age + " " + String.format("%.0f", total) + " " + status   ;
    }

    @Override
    public int compareTo(ResultsTest o) {
        if(this.total < o.total) return 1;
        else if(this.total == o.total) return this.id.compareTo(o.id);
        return -1;
    }
}
