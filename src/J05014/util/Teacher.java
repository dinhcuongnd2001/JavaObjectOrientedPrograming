
package J05014.util;

public class Teacher implements Comparable<Teacher>{
    private String  seri, id,name, subject, status;
    private double mark1 , mark2, bonus , total;

    public Teacher(int i , String name,String id, double mark1, double mark2) {
        this.seri = "GV" + String.format("%02d", i);
        this.id = id;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        if(this.id.substring(0 ,1).equals("A")) this.subject = "TOAN";
        else if(this.id.substring(0,1).equals("B")) this.subject = "LY";
        else this.subject = "HOA";
        
        if(this.id.substring(1,2).equals("1")) this.bonus = 2;
        else if(this.id.substring(1,2).equals("2")) this.bonus = 1.5;
        else if(this.id.substring(1,2).equals("3")) this.bonus = 1.0;
        else this.bonus = 0;
        this.total = this.mark1*2 + this.mark2 + this.bonus;
        if(this.total >= 18) this.status = "TRUNG TUYEN";
        else this.status = "LOAI";
    }

    @Override
    public String toString() {
        return seri + " " + name + " " + subject+ " " + String.format("%.1f", total) + " " + status ;
    }
    
    @Override   
    public int compareTo(Teacher o) {
        if(this.total < o.total) return 1;
        else if(this.total == o.total) return this.seri.compareTo(o.seri);
        return -1;
    }
    
}
