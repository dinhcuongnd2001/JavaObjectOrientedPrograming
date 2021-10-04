
package J05054.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Student {
    String id, name, classification;
    double average;
    long rank;
    private static HashMap<Double, Integer> store = new HashMap<>();

    public Student(int i, String name, double average) {
        this.id = "HS" + String.format("%02d", i);
        this.name = name;
        this.average = average;
        if(this.average < 5) this.classification = "Yeu";
        else if(this.average < 7) this.classification = "Trung Binh";
        else if(this.average < 9) this.classification = "Kha";
        else this.classification = "Gioi";
        store.put(average, store.getOrDefault(average, 0) + 1);
    }
    public int getRank(){
        int rank = 1;
        ArrayList<Double> a = new ArrayList<>(store.keySet());
        Collections.sort(a); 
        for(int i = 0 ; i < a.size() ; i++){
            if(this.average < a.get(i)){
                rank += store.get(a.get(i));
            }
        }
        return rank;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " +  average + " " + classification;
    }
    
}
