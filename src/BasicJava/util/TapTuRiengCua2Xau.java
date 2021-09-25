
package BasicJava.util;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
public class TapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0){
            String []s1 = in.nextLine().split(" ");
            String []s2 = in.nextLine().split(" ");
            HashMap<String , Integer> ans = new HashMap<>();
            HashMap<String , Integer> store = new HashMap<>();
            for(String x : s2){
                store.put(x, store.getOrDefault(x, 0) + 1);
            }
            for(String x: s1){
                if(store.get(x) == null){
                    ans.put(x, ans.getOrDefault(x, 0) + 1) ;
                }
            }
            for(String x : ans.keySet()){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
