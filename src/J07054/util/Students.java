package J07054.util;

import java.util.*;

public class Students implements Comparable<Students>{
    private String id, name;
    private int m1, m2, m3, rank;
    private double average;
    public static HashMap<Double, Integer> store = new HashMap<>();

    public Students(int i, String name, int m1, int m2, int m3) {
        this.id = "SV" + String.format("%02d", i);
        this.name = "";
        String s[] = name.trim().toLowerCase().split("\\s+");
        for(String x : s){
            this.name = this.name + x.substring(0,1).toUpperCase() + x.substring(1)+ " ";
        }
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.average = (m1*3+m2*3+m3*2)/8.0;
        store.put(this.average, store.getOrDefault(this.average,0)+1);
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return id + " " + name +  String.format("%.2f" ,average)+" " + rank ;
    }

    @Override
    public int compareTo(Students o) {
        if(this.average < o.average) return 1;
        else if(this.average == o.average) return this.id.compareTo(o.id);
        return -1;
    }
}
