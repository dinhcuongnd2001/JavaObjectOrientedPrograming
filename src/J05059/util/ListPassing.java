
package J05059.util;

import java.util.*;

public class ListPassing implements Comparable<ListPassing>{
    private String id, name, result;
    private Double math, physics, chemistry, bonus, total;
    public static HashMap<String , Double> store = new HashMap<>();
    public static double standard ;
    public ListPassing(String id, String name, Double math, Double physics, Double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.bonus = store.get(id.substring(0,3));
        this.total = Math.round((this.math*2 + this.physics + this.chemistry + this.total) * 10.0) / 10.0;
    }

    public Double getTotal() {
        return total;
    }
    
    public static void setStore(){
        store.put("KV1", 0.5);
        store.put("KV2", 1.0);
        store.put("KV3", 2.5);
    }
    
    public void setResult() {
        if(this.total >= ListPassing.standard){
            this.result = "TRUNG TUYEN";
        }
        else this.result = "TRUOT";
    }

    @Override
    public String toString() {
        String stBonus = "", stTotal = "";
        if(this.bonus*10 % 10 == 0) stBonus = String.format("%.0f", this.bonus);
        else stBonus = String.format("%.1f", this.bonus);
        if(this.total*10 % 10 == 0) stTotal = String.format("%.0f", this.total);
        else stTotal = String.format("%.1f", this.total);
        return id + " " + name + " " + stBonus + " " + stTotal +  " "  + result  ;
    }
      
    @Override
    public int compareTo(ListPassing o) {
        if(this.total < o.total) return 1;
        else if(this.total == o.total) return this.id.compareTo(o.id);
        return -1;
    }
}
