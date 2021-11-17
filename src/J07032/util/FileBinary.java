package J07032.util;

import java.util.*;
import java.io.*;

public class FileBinary {
    private static SortedMap<Integer , Integer> store = new TreeMap<>();
    private int a[] = new int[1000001];
    
    public boolean check(int x){
        String a = String.valueOf(x);
        StringBuilder b = new StringBuilder(a);
        
        for(int i = 0 ; i < a.length(); i++){
            if((a.charAt(i) - '0') % 2 == 0){
                return false;
            }
        }
        
        if(a.length() %  2 == 0 || a.length() == 1){
            return false;
        }
        return b.reverse().toString().equals(a);
    }

    public FileBinary(String file) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Integer> ans = (ArrayList<Integer>)in.readObject();
        for(Integer x : ans){
            if(check(x)){
                a[x] += 1;
            }
        }
    }
    
    public void showResult(FileBinary f){
        for(int i = 0 ; i <= 1000000 ; i++){
            if(a[i] >0 && f.a[i] > 0){
                store.put(i, store.getOrDefault(i, 0) + (a[i] + f.a[i]));
            }
        }
        int count = 0;
        for(SortedMap.Entry<Integer, Integer> it : store.entrySet()){
            if(count > 9) break;
            System.out.println(it.getKey() + " " + it.getValue());
            count += 1;
        }
    }
    
}
