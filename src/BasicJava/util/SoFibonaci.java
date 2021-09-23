
package BasicJava.util;

import java.util.Scanner;

public class SoFibonaci {
     public static void main(String[] args) {
        Scanner In = new Scanner(System.in) ;
        byte t = In.nextByte() ;
        while(t > 0){
            byte n = In.nextByte() ;
            System.out.println(fibonaci(n));
            t--;
        }
    }

    public static long fibonaci(byte n){
        long f[] = new long[100] ;
        f[1] = f[2] = 1;
        for(byte i = 2 ; i <= n ; i++){
            f[i] = f[i-1] + f[i-2] ;
        }
        return f[n] ;
    }
}
