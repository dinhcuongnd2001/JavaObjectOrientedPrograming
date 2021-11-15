
package J07034.util;


public class Subjects implements Comparable<Subjects>{
    private String id, name, count;

    public Subjects(String id, String name, String count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + count;
    }

    @Override
    public int compareTo(Subjects o) {
        return this.name.compareTo(o.name);
    }
    
}
