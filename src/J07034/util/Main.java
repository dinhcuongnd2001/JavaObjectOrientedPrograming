package J07034.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner("MONHOC.in");
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Subjects> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            Subjects a = new Subjects(in.nextLine(), in.nextLine(), in.nextLine());
            store.add(a);
        }
        Collections.sort(store);
        for(Subjects x : store){
            System.out.println(x);
        }
    }
}
