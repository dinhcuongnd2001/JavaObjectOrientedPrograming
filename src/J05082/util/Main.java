package J05082.util;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Clients> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Clients a = new Clients(i, in.nextLine(), in.nextLine() , in.nextLine(), in.nextLine());
            store.add(a);
        }
        Collections.sort(store);
        for(Clients a : store){
            System.out.println(a);
        }
    }
}
