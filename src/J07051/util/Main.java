
package J07051.util;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Clients> store = new ArrayList<>();
        Clients.creatCost();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n ; i++){
            Clients a = new Clients(i, in.nextLine(),in.nextLine(), in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()));
            store.add(a);
        }
        Collections.sort(store);
        for(Clients x : store){
            System.out.println(x);
        }
    }
}
