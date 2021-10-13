
package J06005.util;

import java.util.ArrayList;
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
            System.out.print(x.getIdOrder() + " "); 
            for(Client y : listClient){
                if(x.getIdClient().equals(y.getIdClient())){
                    System.out.print(y + " ");
                    break;
                }
            }
            for(Items z : listItems){
                if(x.getIdItem().equals(z.getIdItems())){
                    System.out.print(z + " ");
                    x.setTotalPay(z.getOutPay());
                }
            }
            System.out.print(x.getCount()+ " " +x.getTotalPay() + "\n");
        }
    }
}
