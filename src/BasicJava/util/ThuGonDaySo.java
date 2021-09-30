
package BasicJava.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int x = in.nextInt();
            a.add(x);
        }
        int i = 0;
        boolean check = true ;
        while(check){
//            for(int i = 0 ; i < n -1 ; i++){
//               
//            }
        }
        System.out.println(a.size());
    }
}
