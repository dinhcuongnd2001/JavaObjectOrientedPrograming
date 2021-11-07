
package J07007.util;

import java.util.*;
import java.io.*;

public class WordSet {
    private HashSet<String> ans = new HashSet<>();
    public WordSet(String x) throws IOException {
        Scanner in= new Scanner(new File(x));
        while(in.hasNext()){
            ans.add(in.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        ArrayList<String> store = new ArrayList<>(ans);
        Collections.sort(store);
        String s = "";
        for(String x : store){
            s = s + x + "\n";
        }
        return s;
    }
    
    
}
