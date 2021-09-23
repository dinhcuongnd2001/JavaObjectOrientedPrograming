
package J05018.util;

public class Transcript implements Comparable<Transcript>{
    private String studentCode , name , degree;
    private double average;

    public Transcript(int i,  String name , double average) {
        this.studentCode = "HS" + String.format("%02d", i);
        this.name = name;
        this.average = average;
    }

    public void setDegree(){
        this.average = Math.round(average * 10) / 10.0 ;
        if(this.average >= 9.0){
            this.degree = "XUAT SAC";
        }
        else if(this.average >= 8.0){
            this.degree = "GIOI";
        }
        else if(this.average >= 7.0){
            this.degree = "KHA";
        }
        else if(this.average >= 5){
            this.degree = "TB";
        }
        else this.degree = "YEU"; 
    }

    @Override
    public String toString() {
        return studentCode + " " + name + " " + String.format("%.01f", average) + " " + degree ;
    }
    
    @Override
    public int compareTo(Transcript o) {
        if(this.average < o.average) return 1;
        else if(this.average == o.average){
            return this.studentCode.compareTo(o.studentCode);
        }
        return -1;
    }   
}
