
package J07018.util;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
          Scanner in = new Scanner(new File("SINHVIEN.in"));
//          Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
          ArrayList<Students> store = new ArrayList<>();
          int n = Integer.parseInt(in.nextLine());
          for(int i = 1 ; i <= n ; i++){
              Students a = new Students(i, in.nextLine(), in.nextLine(),in.nextLine(), Float.parseFloat(in.nextLine()));
              store.add(a);
          }
          for(Students x : store){
              System.out.println(x);
          }
    }
}
