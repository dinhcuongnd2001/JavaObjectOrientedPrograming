
package J07035.util;

public class Students {
    private String id, name, grade, email;

    public Students(String id, String name, String grade, String email) {
        this.id = id;
        this.name = "";
        String []s= name.toLowerCase().trim().split("\\s+");
        for(int i = 0 ; i <s.length ; i++){
            this.name = this.name + s[i].substring(0,1).toUpperCase() + s[i].substring(1) + " ";
        }
        this.grade = grade;
        this.email = email;
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

    public String getGrade() {
        return grade;
    }
}
