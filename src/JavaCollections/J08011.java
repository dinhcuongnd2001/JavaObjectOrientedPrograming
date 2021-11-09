package JavaCollections;

import java.util.*;
import java.io.*;
public class J08011 {
    
    public static boolean upper(int a){
        String x = String.valueOf(a);
        for(int i = 0 ; i < x.length()-1; i++){
            if(x.charAt(i)> x.charAt(i+1))
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        LinkedHashMap<Integer, Integer> store = new LinkedHashMap<>();
        while(in.hasNextInt()){
            int a = in.nextInt();
            if(upper(a)){
                store.put(a, store.getOrDefault(a, 0) + 1);
            }
        }
        LinkedList<HashMap.Entry<Integer, Integer>> res = new LinkedList<>();
        res.addAll(store.entrySet());
        Collections.sort(res, new Comparator<HashMap.Entry<Integer, Integer>>(){
            @Override
            public int compare(HashMap.Entry<Integer,Integer>o1, HashMap.Entry<Integer,Integer>o2){
                return o2.getValue().compareTo(o1.getValue());
            }
    });
        for(HashMap.Entry<Integer, Integer> x : res){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
