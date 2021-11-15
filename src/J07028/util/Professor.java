package J07028.util;

public class Professor {
    private String id, name ;

    public Professor(String x) {
        String s[] = x.split(" ",2);
        this.id = s[0];
        this.name = s[1];
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}
