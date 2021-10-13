
package J06001.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Product> listProduct = new ArrayList<>();
        ArrayList<Order> listOrder = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i= 1 ; i <= n ; i++){
            Product a = new Product(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            listProduct.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= m ; i++){
            Order a = new Order(in.next(), in.nextLong());
            listOrder.add(a);
        }
        for(Order x : listOrder){
            for(Product y : listProduct){
                if(x.getId().substring(0,2).equals(y.getId())){
                    x.setNameProduct(y.getName());
                    long val = 0 ;
                    if(x.getId().charAt(2) == '1'){
                        val = y.getCost1();
                    }
    
                    else val = y.getCost2();
                    x.setTotalAndTotalPay(val);
                    break;
                }
            }            
        }
        for(Order x : listOrder){
            System.out.println(x);
        }
    }   
}
