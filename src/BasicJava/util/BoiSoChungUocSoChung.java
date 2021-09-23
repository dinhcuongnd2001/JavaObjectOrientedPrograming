
package BasicJava.util;

import java.util.Scanner;

public class BoiSoChungUocSoChung {
    public static long GCD(long a , long b){
        long tmp;
        while(b != 0){
            tmp = a % b ;
            a = b ;
            b = tmp;
        }
        return a ;
    }

    public static long LCM(long a , long b){
        long tmp = a * b ;
        return tmp /(GCD(a , b)) ;
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in) ;
        byte t = In.nextByte();
        while((t--) > 0){
            long a , b ;
            a = In.nextInt();
            b = In.nextInt();
            System.out.println(LCM(a , b) + " " + GCD(a , b));
        }
    }
}
