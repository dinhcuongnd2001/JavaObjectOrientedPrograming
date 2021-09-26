
package BasicJava.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        HashMap<String ,Integer> store = new HashMap<>();
        int val = 2 , count = 0 ;
        char a = 'A' ;
        while(val < 10){
            if(val == 7 || val == 9){
                count = 4;
            }
            else count = 3 ;
            while(count-- > 0){
                store.put(String.valueOf(a), val); 
                a += 1 ;
            }
            val += 1;
        }
        while(n-- > 0){
            String x = in.nextLine().toUpperCase();
            String ans = "";
            for(int i = 0 ; i < x.length() ; i++){
                ans += String.valueOf(store.get(String.valueOf(x.charAt(i))));
            }
            String mark = new StringBuilder(ans).reverse().toString();
            if(ans.equals(mark))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
