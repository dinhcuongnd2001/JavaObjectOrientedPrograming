
package J07055.util;
public class Students implements Comparable<Students>{
    private String id, name,rank;
    private long m1,m2,m3;
    private double avergae;

    public Students(int i, String name, long m1, long m2, long m3) {
        this.id = "SV" + String.format("%02d",i);
        this.name = "";
        String s[] = name.trim().toLowerCase().split("\\s+");
        for(String x : s){
            this.name = this.name + x.substring(0,1).toUpperCase() + x.substring(1) + " "; 
        }
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.avergae = (m1*25.0 + m2*35.0 + m3*40.0) / 100.0;
        if(this.avergae >= 8) this.rank = "GIOI";
        else if(this.avergae >= 6.5) this.rank = "KHA";
        else if(this.avergae >= 5) this.rank = "TRUNG BINH";
        else this.rank = "KEM";
    }

    @Override
    public int compareTo(Students o) {
        if(this.avergae < o.avergae) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return  id + " " + name  + String.format("%.2f", avergae)+ " " + rank;
    }
    
}
