package J04022.util;

import java.util.TreeSet;

public class WordSet {
    TreeSet<String> st = new TreeSet<>();
    public WordSet(String s) {
        String x[]= s.trim().toLowerCase().split("\\s+");
        for(String y : x){
            st.add(y);
        }
    }
    public String union(WordSet a){
        String res = "";
        TreeSet<String> ans = new TreeSet<>();
        ans.addAll(st);
        ans.addAll(a.st);
        Object x[] = ans.toArray();
        for(Object y: x){
            res += y + " ";
        }
        return res;
    }
    
        public String intersection(WordSet a){
        String res = "";
        TreeSet<String> ans = new TreeSet<>();
        ans.addAll(st);
        ans.retainAll(a.st);
        Object x[] = ans.toArray();
        for(Object y: x){
            res += y + " ";
        }
        return res;
    }
    
}
