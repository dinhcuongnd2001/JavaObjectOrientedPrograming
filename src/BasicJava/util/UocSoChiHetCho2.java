
package BasicJava.util;

import java.util.Scanner;

public class UocSoChiHetCho2 {
     public static int solve(long n){
        int count = 0 , count1 = 1 , val ;
        while( n % 2 == 0){
            n /= 2 ;
            count++;
        }
        for(int i = 3; i <= Math.sqrt(n) ; i++){
            val = 0 ;
            while (n % i == 0){
                n /= i ;
                val ++ ;
            }
            count1 *= (val + 1) ;
        }
        if(n > 1) count1 *= 2;
        return count * (count1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            long n = in.nextLong();
            System.out.println(solve(n));
        }
    }
}
