
package J05076.util;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Products> listProducts = new ArrayList<>();
        ArrayList<Orders> listOrders = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Products a = new Products(in.nextLine(),in.nextLine(), in.nextLine());
            listProducts.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= m ; i++){
            Orders a = new Orders(in.nextLine());
            listOrders.add(a);
        }
        for(Orders x : listOrders){
            for(Products y : listProducts){
                if(x.getIdProduct().equals(y.getId())){
                    y.setOders(x.getCountIn(), x.getCost(), x.getCountOut());
                    System.out.println(y);
                    break;
                }
            }
        }
//        for(Products y : listProducts){
//            System.out.println(y);
//        }
    }
}
