
package J05057.util;

public class Scores {
    private String id, name , status;
    private double math, physics, chemistry, bonus, total;

    public Scores(String id, String name, double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math*2;
        this.physics = physics;
        this.chemistry = chemistry;
        String area = this.id.substring(0,3);
        if(area.equals("KV1")) this.bonus = 0.5;
        else if(area.equals("KV2")) this.bonus = 1.0;
        else this.bonus = 2.5;
        this.total = this.math + this.chemistry + this.physics;
        if(this.total + this.bonus >= 24) this.status = "TRUNG TUYEN";
        else this.status = "TRUOT";
      
    }

    @Override
    public String toString() {
        String stBonus = "", stTotal = "";
        if(this.total == (int)this.total) stTotal = String.format("%.0f" , total);
        else stTotal = String.format("%.1f" , total);
        if(this.bonus == (int)this.bonus) stBonus= String.format("%.0f" , bonus);
        else stBonus = String.format("%.1f" , bonus);
        String res = id + " " + name  + " " + stBonus + " " + stTotal + " " + status;
        return res;
    }
}
