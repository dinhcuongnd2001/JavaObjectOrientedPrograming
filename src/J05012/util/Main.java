
package J05012.util;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Order> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
           Order a = new Order(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
           store.add(a);
        }
        Collections.sort(store);
        for(Order x : store){
            System.out.println(x);
        }
    }
}