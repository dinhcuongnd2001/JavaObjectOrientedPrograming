package J07037.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DN.in"));
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Companys> store = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            Companys a = new Companys(in.nextLine(), in.nextLine() ,in.nextLine());
            store.add(a);
        }
        Collections.sort(store);
        for(Companys x : store){
            System.out.println(x);
        }
    }
}
