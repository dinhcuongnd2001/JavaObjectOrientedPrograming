package J06007.util;

public class Professors {
    private String id, name;

    public Professors(String x) {
        String s[] = x.split(" ",2);
        this.id = s[0];
        this.name = s[1];
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
    
}
