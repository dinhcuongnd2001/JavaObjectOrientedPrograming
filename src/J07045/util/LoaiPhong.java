
package J07045.util;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String id, type;
    private long cost;
    private double service;

    public LoaiPhong(String x) {
        String s[] = x.split(" " , 4);
        this.id = s[0];
        this.type = s[1];
        this.cost = Long.parseLong(s[2]);
        this.service = Double.parseDouble(s[3]);
    }

    @Override
    public String toString() {
        return  id + " " + type + " " + cost + " " + service ;
    }

       
    @Override
    public int compareTo(LoaiPhong o) {
        return this.type.compareTo(o.type);
    }
}
