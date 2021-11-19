package J07046.util;

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(new File("KHACH.in"));
//          Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
          ArrayList<InfoClients> store = new ArrayList<>();
          int n = Integer.parseInt(in.nextLine());
          for(int i = 1 ; i <= n ; i++){
              InfoClients a = new InfoClients(i , in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
              store.add(a);
          }
          
          Collections.sort(store);
          for(InfoClients x : store){
              System.out.println(x);
          }
    }
}
