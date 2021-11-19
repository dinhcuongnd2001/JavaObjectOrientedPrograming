package J07048.util;


public class Products implements Comparable<Products>{
    private String id, name, cost, date;

    public Products(String id, String name, String cost, String date) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.date = date;
    }

    @Override
    public String toString() {
        return   id + " " + name + " " + cost + " " + date;
    }

    @Override
    public int compareTo(Products o) {
        if(Integer.parseInt(this.cost) < Integer.parseInt(o.cost)) return 1;
        else if(this.cost.equals(o.cost)) return this.id.compareTo(o.id);
        return -1;
    }

}
