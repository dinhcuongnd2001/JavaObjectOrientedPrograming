
package J05034.util;

public class Internship implements Comparable<Internship>{
    private String Number , StudentCode , Name , NClass , Email , Enterprise ; 

    public Internship(int i , String StudentCode, String Name, String NClass, String Email, String Enterprise) {
        this.Number = String.format("%01d", i);
        this.StudentCode = StudentCode;
        this.Name = Name;
        this.NClass = NClass;
        this.Email = Email;
        this.Enterprise = Enterprise;
    }

    public String getEnterprise() {
        return Enterprise;
    }
    

    @Override
    public String toString() {
        return Number + " " + StudentCode + " " + Name + " " + NClass + " " + Email + " " + Enterprise ;
    }

    @Override
    public int compareTo(Internship o) {
        if(this.Name.compareTo(o.Name) > 0)return 1 ;
        return -1;
    }
}
