
package J07033.util;

public class Students implements Comparable<Students>{
    private String id, name, grade, email;

    public Students(String id, String name, String grade, String email) {
        this.id = id;
        this.name = "";
        String s[]= name.toLowerCase().trim().split("\\s+");
        for(int i = 0 ; i < s.length ; i++){
            this.name = this.name + s[i].substring(0,1).toUpperCase() + s[i].substring(1) + " ";
        }
        this.grade = grade;
        this.email = email;
    }

    @Override
    public String toString() {
        return  id + " " + name + grade + " " + email;
    }

    @Override
    public int compareTo(Students o) {
        return this.id.compareTo(o.id);
    }
    
}
