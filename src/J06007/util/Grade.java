
package J06007.util;

import java.util.*;

public class Grade {
    private double total;
    private Subjects s;
    private Professors p;
    public static HashMap<String, Double> store = new HashMap<>();
    
    public Grade(String x) {
        String s[] = x.split(" " , 3);
        this.total = Double.parseDouble(s[2]);
        store.put(s[0], store.getOrDefault(s[0],0.00)+this.total);
        this.s = new Subjects("   ");
        this.p = new Professors("   ");
        this.p.setId(s[0]);
        this.s.setId(s[1]);
    }

    public void setS(Subjects s) {
        this.s = s;
    }

    public void setP(Professors p) {
        this.p = p;
    }

    public Subjects getS() {
        return s;
    }

    public Professors getP() {
        return p;
    }
    
    
}
