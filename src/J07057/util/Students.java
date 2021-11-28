package J07057.util;

public class Students implements Comparable<Students>{
    private String id, name, nation,status, area;
    private double mark, bonus, total;
    private static double standard = 20.5;

    public Students(int i, String name,double mark, String nation, String area) {
        this.id = "TS" + String.format("%02d", i);
        this.name = "";
        String s[] = name.trim().toLowerCase().split("\\s+");
        for(String x : s){
            this.name = this.name + x.substring(0,1).toUpperCase()+x.substring(1) +" ";
        }
        this.mark = mark;
        this.nation = nation;
        this.area = area;
        this.bonus = 0 ;
        if(this.nation.equals("Kinh") == false) this.bonus += 1.5;
        if(this.area.equals("1")) this.bonus += 1.5;
        else if(this.area.equals("2")) this.bonus += 1;
        this.total = this.mark  + this.bonus;
        if(this.total >= standard) this.status = "Do";
        else this.status = "Truot";
    }

    @Override
    public String toString() {
        return id + " " + name + total + " " + status ;
    }

    @Override
    public int compareTo(Students o) {
        if(this.total < o.total) return 1;
        else if(this.total == o.total) return this.id.compareTo(o.id);
        return -1;
    }  
}
