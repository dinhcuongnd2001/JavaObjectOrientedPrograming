
package J07020.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Order> listOrders = new ArrayList<>();
        ArrayList<Items> listItemses = new ArrayList<>();
        ArrayList<Client> listClients = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Client a = new Client(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            listClients.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= m ; i++){
            Items a = new Items(i, in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            listItemses.add(a);
        }
        int k = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= k ; i++){
            Order a = new Order(i, in.nextLine());
            listOrders.add(a);
        }
        for(Order x : listOrders){
            for(Client y : listClients){
                if(x.getC1().getId().equals(y.getId())){
                   x.setC1(y);
                   break;
                }
            }
            for(Items z : listItemses){
                if(x.getI1().getId().equals(z.getId())){
                    x.setI1(z);
                    break;
                }
            }
        }
        for(Order x : listOrders){
            System.out.println(x);
        }
    }
}
