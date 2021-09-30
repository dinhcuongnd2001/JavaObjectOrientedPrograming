
package BasicJava.util;

import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 0 ;
        long a[] = new long[25];
        a[0] = 1;
        int n = in.nextInt();
        for(int i = 1 ; i <= n ; i++){
            a[i] = a[i-1] * i ;
            sum += a[i];
        }
        System.out.println(sum);
    }
}
