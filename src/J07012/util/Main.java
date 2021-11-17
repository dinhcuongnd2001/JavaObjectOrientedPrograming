package J07012.util;

import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> store = (ArrayList<String>) in.readObject();
        String s = "";
        for(String x : store){
            s = s + x + " ";
        }
        String [] ans  = s.toLowerCase().trim().replaceAll("\\W+", " ").split("\\s+");
        HashMap<String, Integer> ds = new HashMap<>();
        for(String x : ans){
            ds.put(x,ds.getOrDefault(x,0) + 1);
        }
        ArrayList<HashMap.Entry<String , Integer>> res = new ArrayList<>(ds.entrySet());
        Collections.sort(res, new Comparator<HashMap.Entry<String, Integer>>(){
            @Override
            public int compare(HashMap.Entry<String, Integer> a , HashMap.Entry<String , Integer> b){
                if(a.getValue() < b.getValue()) return 1;
                else if(a.getValue() == b.getValue()) return a.getKey().compareTo(b.getKey());
                return -1;
            }
        });
        
        for(HashMap.Entry<String, Integer> a : res){
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}
