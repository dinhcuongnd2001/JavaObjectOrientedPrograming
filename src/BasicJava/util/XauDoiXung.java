
package BasicJava.util;

import java.util.Scanner;

public class XauDoiXung {
    public static boolean check(String s){
        int l = 0 , r = s.length() -1 ;
        int count = 0 ;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r))
                count++;
            l++ ;
            r--;
        }
        if(count == 1){
            return true ;
        }
        else{
            if(count == 0 && s.length() % 2 == 1) return true ;
            else return false ;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            String a = in.next();
            if(check(a))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
