
package BasicJava.util;

import java.util.Scanner;


public class HieuSoNguyenLon1 {
    public static void solve(String a, String b){
        if(a.compareTo(b) < 0){
            String c = a ;
            a = b ;
            b = c ;
        }
        
        int c = 0 , tg ;
        String ans = "";
        for(int i = a.length()- 1 ; i >= 0 ; i--){
            tg = (a.charAt(i) - '0') - (b.charAt(i) - '0') - c ;
            if(tg < 0){
                tg += 10 ;
                c = 1 ;
            }
            else c = 0 ;
            ans = String.valueOf(tg) + ans ;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            String a = in.next() , b = in.next();
            if(a.length() < b.length()){
                String c = a;
                a = b;
                b = c ;
            }
            while(b.length()< a.length()) b = "0" + b ;
            solve(a , b);
        }
    }
}
