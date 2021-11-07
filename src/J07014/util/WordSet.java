package J07014.util;

import java.util.*;
import java.io.*;

public class WordSet {
    HashSet<String> store = new HashSet<>();

    public WordSet(String s) throws IOException {
       Scanner in = new Scanner(new File(s));
       while(in.hasNext()){
           store.add(in.next().toLowerCase());
       }
    }
    
    public String union(WordSet s2){
        HashSet<String> setUnion  = new HashSet<>();
        setUnion.addAll(store);
        setUnion.addAll(s2.store);
        ArrayList<String> ans = new ArrayList<>(setUnion);
        Collections.sort(ans);
        String x = "";
        for(String y : ans){
            x = x + y + " ";
        }
        return x ;
    }
    
    public String intersection(WordSet s2){
    HashSet<String> setIntersection  = new HashSet<>();
    setIntersection.addAll(store);
    setIntersection.retainAll(s2.store);
    ArrayList<String> ans = new ArrayList<>(setIntersection);
    Collections.sort(ans);
    String x = "";
    for(String y : ans){
        x = x + y + " ";
    }
    return x ;
}
}
