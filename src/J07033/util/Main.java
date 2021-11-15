package J07033.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("SINHVIEN.in"));
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Students> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            Students a = new Students(in.nextLine(),in.nextLine(),in.nextLine(), in.nextLine());
            store.add(a);
        }
        Collections.sort(store);
        for(Students x : store){
            System.out.println(x);
        }
    }
}
