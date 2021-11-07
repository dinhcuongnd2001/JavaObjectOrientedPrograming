
package J07020.util;

public class Items {
    private String id, name, unit;
    private long cost, sell;

    public Items(int i, String name, String unit, long cost, long sell) {
        this.id = "MH" + String.format("%03d", i);
        this.name = name;
        this.unit = unit;
        this.cost = cost;
        this.sell = sell;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public long getCost() {
        return cost;
    }

    public long getSell() {
        return sell;
    }
    
}
