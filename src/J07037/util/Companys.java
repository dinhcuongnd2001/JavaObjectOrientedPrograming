package J07037.util;

public class Companys implements Comparable<Companys>{
    private String id, name, count;

    public Companys(String id, String name, String count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + count;
    }

    
    
    @Override
    public int compareTo(Companys o) {
        return this.id.compareTo(o.id);
    }    
}
