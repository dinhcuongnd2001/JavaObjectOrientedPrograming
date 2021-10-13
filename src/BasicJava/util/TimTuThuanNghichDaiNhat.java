
package BasicJava.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TimTuThuanNghichDaiNhat {
    public static boolean check(String x){
        return (new StringBuilder(x).reverse().toString().equals(x));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String , Integer> store = new LinkedHashMap<>();
        int lengthMax = -1;
        while(in.hasNext()){
            String letter = in.next();
            if(check(letter)){
                store.put(letter, store.getOrDefault(letter, 0) + 1);
                if(letter.length() > lengthMax){
                    lengthMax = letter.length();
                }
            }
        }
        for(Map.Entry<String, Integer> entry: store.entrySet()){
            if(entry.getKey().length() == lengthMax){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
