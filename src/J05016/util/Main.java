
package J05016.util;

import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner in = new Scanner(System.in);
        ArrayList<OrderHotel> listOrderHotels = new ArrayList<>();
        OrderHotel.getStore();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            OrderHotel a = new OrderHotel(i, in.nextLine(),in.nextLine(), in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()));
            listOrderHotels.add(a);
        }
        Collections.sort(listOrderHotels);
        for(OrderHotel x : listOrderHotels){
            System.out.println(x);
        }
    }
}
