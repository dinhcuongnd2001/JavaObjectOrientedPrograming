
package J05017.util;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Order> listOrders = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            Order a = new Order(i, in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            listOrders.add(a);
        }
        Collections.sort(listOrders);
        for(Order x : listOrders){
            System.out.println(x);
        }
    }
}
