package J07022.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
          Scanner in = new Scanner(new File("DATA.in"));
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<String> store = new ArrayList<>();
        while(in.hasNext()){
            String x = in.next();
            try {
                int val = Integer.parseInt(x);
            } catch (Exception e) {
                store.add(x);
            }
        }
        Collections.sort(store);
        for(String x : store){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
