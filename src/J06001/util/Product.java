
package J06001.util;

public class Product {
    private String id, name ;
    private long cost1 , cost2;

    public Product(String id, String name, long cost1, long cost2) {
        this.id = id;
        this.name = name;
        this.cost1 = cost1;
        this.cost2 = cost2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCost1() {
        return cost1;
    }

    public long getCost2() {
        return cost2;
    }
    
}
