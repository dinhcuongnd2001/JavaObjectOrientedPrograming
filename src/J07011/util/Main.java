
package J07011.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(new File("VANBAN.in"));
//         Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        HashMap<String, Integer> store = new HashMap<>();
        int n = Integer.parseInt(in.nextLine());
        while(n-- >0){
           String s[] = in.nextLine().trim().replaceAll("\\W+", " ").toLowerCase().split("\\s+");
           for(String a : s){
               store.put(a, store.getOrDefault(a,0)+1);
           }
        }
        ArrayList<HashMap.Entry<String, Integer>> res = new ArrayList<>(store.entrySet());
        Collections.sort(res, new Comparator<HashMap.Entry<String, Integer>>(){
            @Override
            public int compare(HashMap.Entry<String, Integer> x1, HashMap.Entry<String, Integer> x2 ){
                if(x1.getValue() < x2.getValue()) return 1;
                else if(x1.getValue() == x2.getValue()){
                    return x1.getKey().compareTo(x2.getKey());
                }
                return -1;
            }
        });
        for(HashMap.Entry<String, Integer> x :res){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
