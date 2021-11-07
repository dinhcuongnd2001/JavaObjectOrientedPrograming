package J07024.util;

import java.util.*;
import java.io.*;

public class WordSet {
    HashSet<String>store = new HashSet<>();

    public WordSet(String file) throws IOException {
        Scanner in = new Scanner(new File(file));
        while(in.hasNext()){
            store.add(in.next().toLowerCase());
        }
    }
    
    public String difference(WordSet a){
        HashSet<String> differenceSet = new HashSet<>();
        differenceSet.addAll(store);
        differenceSet.removeAll(a.store);
        ArrayList<String>ans = new ArrayList<>(differenceSet);
        String res = "";
        Collections.sort(ans);
        for(String x : ans){
            res = res + x + " ";
        }
        return res;
    }
    
    
    
    
}
