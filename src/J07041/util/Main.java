package J07041.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> store = (ArrayList<Pair>)in.readObject();
        HashMap<Long, Long> check = new HashMap<>();
        ArrayList<Pair> res = new ArrayList<>();
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
//        ArrayList<Pair> store = new ArrayList<>();
//        int n =  Integer.parseInt(in.nextLine());
//        for(int i = 0 ; i < n ; i++){
//            store.add(new Pair(in.nextInt(), in.nextInt()));
//        }
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
