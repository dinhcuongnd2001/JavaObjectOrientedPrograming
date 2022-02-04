package J05073.util;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Orders> st = new ArrayList<>();
        Orders.creat();
        int n = in.nextInt();
        for(int i = 0; i< n ; i++){
            Orders x = new Orders(in.next(),in.nextLong(), in.nextLong());
            st.add(x);
        }
        for(Orders x : st){
            System.out.println(x);
        }
    }
}
