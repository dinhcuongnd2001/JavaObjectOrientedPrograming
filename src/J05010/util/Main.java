
package J05010.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Products> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n ; i++){
            Products a = new Products(i , in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            store.add(a);
        }
        Collections.sort(store);
        for(Products x : store){
            System.out.println(x);
        }
    }
}
