
package J05080.util;

import java.util.HashMap;

public class Term implements Comparable<Term>{
    private String id, name, group, nameTeacher;
    public static HashMap<String, String > storeId = new HashMap<>() ;

    public Term(String id, String name, String group, String nameTeacher) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.nameTeacher = nameTeacher;
        storeId.put(id, name);
    }

    public String getNameTeacher() {
        return nameTeacher;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + group;
    }

    @Override
    public int compareTo(Term o) {
        if(this.id.compareTo(o.id) > 0) return 1;
        else if(this.id.equals(o.id)) return this.group.compareTo(o.group);
        return -1;
    }
}