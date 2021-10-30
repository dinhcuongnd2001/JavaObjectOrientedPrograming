
package J07020.util;

public class Client {
    private String id, name, gender, dateOB, add;

    public Client(int i, String name, String gender, String dateOB, String add) {
        this.id = "HK" + String.format("%03d", i);
        this.name = name;
        this.gender = gender;
        this.dateOB = dateOB;
        this.add = add;
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

    public String getAdd() {
        return add;
    }
    
}
