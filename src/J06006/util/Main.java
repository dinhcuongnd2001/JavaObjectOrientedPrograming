
package J06006.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Client> listClient = new ArrayList<>();
        ArrayList<Items> listItems = new ArrayList<>();
        ArrayList<Order> listOrders = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Client a = new Client(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            listClient.add(a);
            
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= m ; i++){
            Items a = new Items(i, in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            listItems.add(a);
        }
        int k = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= k ; i++){
            Order a = new Order(i , in.next() , in.next() , Long.parseLong(in.next()));
            listOrders.add(a);
        }
        
        for(Order x : listOrders){
            for(Client y : listClient){
                if(x.getIdClient().equals(y.getIdClient())){
                    x.setNameClient(y.getName());
                    x.setAddressClient(y.getAddress());
                    break;
                }
            }
            for(Items z : listItems){
                if(x.getIdItem().equals(z.getIdItems())){
                    x.setNameItem(z.getName());
                    x.setTotalPay(z.getOutPay());
                    x.setProfit(z.getInPay(), z.getOutPay());
                }
            }
    
        }
        Collections.sort(listOrders);
        for(Order x : listOrders){
            System.out.println(x);
        }
    }
}
