
package BasicJava.util;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            System.out.println(((n+1)*n/2));
        }
    }
}
