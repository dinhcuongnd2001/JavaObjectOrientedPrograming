package J07028.util;

import java.util.HashMap;

public class StandardTime {
    private Professor p ;
    private double hours;
    static HashMap<String, Double> store = new HashMap<>();
    public StandardTime(String x) {
        String s[]= x.split(" ", 3);
        this.p = new Professor(s[0]+"    ");
        this.hours = Double.parseDouble(s[2]);
        store.put(s[0], store.getOrDefault(s[0], 0.0) + this.hours);
    }

    public void setP(Professor p) {
        this.p = p;
    }
    
    public Professor getP() {
        return p;
    }
    
    @Override
    public String toString() {
        return p.getName() +" " + String.format("%.2f",store.get(p.getId()));
    }
    
}
