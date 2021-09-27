
package BasicJava.util;

import java.math.BigInteger;
import java.util.Scanner;


public class UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}
