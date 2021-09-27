
package BasicJava.util;

import java.util.Scanner;

public class UocNguyenToLonNhat {
    public static boolean isPrime(long n){
        if ( n < 2) return false ;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false ;
        }
        return true ;
    }

    public static long solve(long n){
       long ans = -1 ;
       for(int i = 2 ; i <= Math.sqrt(n); i++){
           if(n % i == 0){
               if(isPrime(i)) ans = Math.max(ans , i);
               if(isPrime(n/i)) ans = Math.max(ans , (n/i));
           }
       }
       if(ans == -1) return n ;
       return ans ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int test = in.nextInt();
        while(test -- >0){
            long a = in.nextLong();
            System.out.println(solve(a));
        }
    }
}
