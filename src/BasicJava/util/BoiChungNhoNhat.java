
package BasicJava.util;

import java.util.Scanner;
import java.math.*;

public class BoiChungNhoNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- > 0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            System.out.println((a.multiply(b)).divide(a.gcd(b)));
        }
        
    }
}