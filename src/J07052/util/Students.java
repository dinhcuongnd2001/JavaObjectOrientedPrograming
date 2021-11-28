
package J07052.util;

import java.util.*;

public class Students implements Comparable<Students>{
    private String id, name,status;
    private double math, physic, chemistry, bonus, total;
    public static double standard;
    public static HashMap<String, Double> bonusMark = new HashMap<>();
    public static ArrayList<Double> store = new ArrayList<>();
    public Students(String id, String name, double math, double physic, double chemistry) {
        this.id = id;
        this.name = "";
        String s[]= name.toLowerCase().trim().split("\\s+");
        for(String x : s){
            this.name = this.name + x.substring(0,1).toUpperCase() + x.substring(1) + " ";
        }
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.bonus = bonusMark.get(id.substring(0,3));
        this.total = this.math*2 + this.physic + this.chemistry + this.bonus;
        store.add(total);
    }
    public static void creatBonusMark(){
        bonusMark.put("KV1", 0.5);
        bonusMark.put("KV2", 1.0);
        bonusMark.put("KV3", 2.5);
    }

    public double getTotal() {
        return total;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String solve(double x){
        String ans = "";
        if(x*10 == (int)x * 10){
            ans = String.format("%.0f",x);
        }
        else ans = String.format("%.1f",x);
        return ans;
    }

    @Override
    public String toString() {
        String stBonus = solve(this.bonus);
        String stTotal = solve(this.total);
        return id + " " + name + stBonus + " " + stTotal + " " + status ;
    }

    @Override
    public int compareTo(Students o) {
        if(this.total < o.total) return 1;
        else if(this.total == o.total) return this.id.compareTo(o.id);
        return -1;
    }
}
