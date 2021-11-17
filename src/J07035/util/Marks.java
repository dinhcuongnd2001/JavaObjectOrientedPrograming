package J07035.util;

public class Marks implements Comparable<Marks>{
    private double mark;
    private Students a;
    private Subjects b;

    public Marks(String x) {
        String s[] = x.split(" ");
        this.mark = Double.parseDouble(s[2]);
        this.a = new Students(s[0] , "DInh Nhu Cuong" , "" , "");
        this.b = new Subjects(s[1], "", "");
    }

    public Students getA() {
        return a;
    }

    public Subjects getB() {
        return b;
    }
    
    public void setA(Students a) {
        this.a = a;
    }

    public void setB(Subjects b) {
        this.b = b;
    }

    @Override
    public String toString() {
        String sMark = "";
        if(this.mark == (long)this.mark){
            sMark = String.format("%d",(long)this.mark);
        }
        else sMark = String.format("%.1f", this.mark);
        return  a.getId()+ " "+ a.getName() + a.getGrade() + " " + sMark;
    }

    @Override
    public int compareTo(Marks o) {
        if(this.mark < o.mark) return 1;
        else if(this.mark == o.mark) return this.a.getId().compareTo(o.a.getId());
        return -1;
    }
}
