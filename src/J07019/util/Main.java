package J07019.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Product>storeProducts = new ArrayList<>();
        ArrayList<Order> storeOrders = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            Product x = new Product(in.nextLine(),in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            storeProducts.add(x);
        }
        in = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= m ; i++){
            Order x = new Order(i, in.next(), Long.parseLong(in.next()));
            storeOrders.add(x);
        }
        for(Order x : storeOrders){
            for(Product y : storeProducts){
                if(x.getIdProduct().equals(y.getIdProduct())){
                    x.setProduct(y);
                    x.handle();
                    break;
                }
            }
        }
        for(Order x : storeOrders){
            System.out.println(x);
        }
    }
}
