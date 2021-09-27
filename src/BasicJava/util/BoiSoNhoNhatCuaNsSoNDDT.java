
package BasicJava.util;

import java.util.Scanner;


public class BoiSoNhoNhatCuaNsSoNDDT {
    public static long GCD(long a , long b){
        while(b != 0){
            long tg = a % b ;
            a = b ;
            b = tg ;
        }
        return a ;
    }
    public static long LCM(long a , long b){
        return (a / GCD(a , b)) * b ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            long ans = 1 ;
            long n = in.nextLong();
            for(long i = 1 ; i <= n ; i++){
                ans = LCM(i , ans) ;
            }
            System.out.println(ans);
        }
    }
}
