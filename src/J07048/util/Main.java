package J07048.util;

import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Products> store = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            Products a = new Products(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            store.add(a);
        }
        Collections.sort(store);
        for(Products x : store){
            System.out.println(x);
        }
    }
}
