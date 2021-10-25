package J05015.util;

import java.math.*;

public class Cua_ro implements Comparable<Cua_ro> {

    private String name, unit, timeFinish, id;
    private long speed, totalTime;

    public Cua_ro(String name, String unit, String timeFinish) {
        this.name = name;
        this.unit = unit;
        this.timeFinish = timeFinish;
        this.id = "";
        String[] s = this.unit.split(" ");
        for (String x : s) {
            this.id += x.substring(0, 1).toUpperCase();
        }
        String[] a = this.name.split(" ");
        for (String x : a) {
            this.id += x.substring(0, 1).toUpperCase();
        }
        String[] t = this.timeFinish.split(":");
        this.totalTime = (Long.parseLong(t[0]) - 6) * 60 + Long.parseLong(t[1]);
        this.speed = (long) Math.round(120.0 * 60.0 / this.totalTime);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + speed + " Km/h";
    }

    @Override
    public int compareTo(Cua_ro o) {
        return this.timeFinish.compareTo(o.timeFinish);
    }
}
