
package BasicJava.util;

import java.util.Scanner;


public class DiemCanBang {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int []a = new int[n+5];
            int []sum = new int[n+5];
            int tong = 0 ;
            for(int i = 1; i <= n ; i++) {
                a[i] = in.nextInt();
                tong += a[i];
                sum[i] = sum[i - 1] + a[i];
            }
            boolean check = true;
            for(int i = 1 ; i <= n ; i++){
                if(sum[i] == (tong - sum[i] + a[i])){
                    System.out.println(i);
                    check = false;
                    break;
                }
            }
            if(check) System.out.println(-1);
        }
    }
}
