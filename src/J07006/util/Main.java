package J07006.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> store = (ArrayList<Integer>) in.readObject();
        int a[] = new int[1004];
        for(Integer x : store){
            a[x] += 1;
        }
        for(int i = 0 ; i <= 1000 ; i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
    }
}
