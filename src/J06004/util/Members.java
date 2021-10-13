
package J06004.util;

public class Members implements Comparable<Members>{
    private String id, name, phone, idGroup;
    public static String topic[] = new String[100];
    private static int count = 0 ;
    public Members(String id, String name, String phone, String idGroup) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.idGroup = idGroup;
    }
    public static void addTopic(String s){
        count += 1;
        topic[count] = s;
    }

    public String getIdGroup() {
        return idGroup;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + idGroup;
    }

    @Override
    public int compareTo(Members o) {
        return this.id.compareTo(o.id) ;
    }
}
