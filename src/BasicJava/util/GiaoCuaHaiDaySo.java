
package BasicJava.util;

import java.util.Scanner;

public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() , m = in.nextInt();
        int a[] = new int[n+5] , b[] = new int[m+5] , a1[] = new int[1005] , b1[] = new int[1005];
        for(int i = 0 ; i < n ; i++){
            a[i] = in.nextInt();
            a1[a[i]] += 1;
        }
        for(int i = 0 ; i < m ; i++){
            b[i] = in.nextInt();
            b1[b[i]] += 1;
        }
        for(int i = 0; i < 1005 ; i++){
            if(a1[i] > 0 && b1[i] > 0) System.out.print(i + " ");
        }
        System.out.println("");
    }
}
