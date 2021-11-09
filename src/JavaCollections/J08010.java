package JavaCollections;

import java.io.*;
import java.util.*;

public class J08010 {
    
    public static boolean reverse(String x){
        StringBuilder y = new StringBuilder(x);
        return y.reverse().toString().equals(x);
    }
    
    public static void main(String[] args) throws IOException {
        LinkedHashMap<String, Integer> store = new LinkedHashMap<>();
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int lengthMax = -1;
        while(in.hasNext()){
            String x = in.next();
            if(reverse(x)){
                lengthMax = Math.max(lengthMax, x.length());
                store.put(x, store.getOrDefault(x,0) + 1);
            }

        }
        for(HashMap.Entry x : store.entrySet()){
            if(x.getKey().toString().length() == lengthMax){
                System.out.println(x.getKey() + " " + x.getValue());
            }
        }
    }
}
