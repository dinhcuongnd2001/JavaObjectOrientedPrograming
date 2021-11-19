package J07041.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> store = (ArrayList<Pair>)in.readObject();
        HashMap<Integer, Integer> check = new HashMap<>();
        ArrayList<Pair> res = new ArrayList<>();
        
        for(Pair x : store){
            if(x.getFirst() < x.getSecond()){
                if(check.get(x.getFirst()) == null){
                    res.add(x);
                    check.put(x.getFirst(), x.getSecond());
                }
            }
        }
        Collections.sort(res);
        for(Pair x : res){
            System.out.println(x);
        }
    }

}
