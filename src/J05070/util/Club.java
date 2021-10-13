
package J05070.util;

public class Club {
    private String id, name;
    private long cost;

    public Club(String id, String name, long cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public long getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
    
}
