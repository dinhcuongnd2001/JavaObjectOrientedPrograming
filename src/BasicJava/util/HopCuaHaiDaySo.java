
package BasicJava.util;

import java.util.HashMap;
import java.util.Scanner;

public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() , m = in.nextInt();
        int a[] = new int[n+5] , b[] = new int[m+5], c[] = new int[1005];
        HashMap<Integer , Integer> ans = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            a[i] = in.nextInt();
//            ans.put(a[i], ans.getOrDefault(a[i], 0) + 1);
            c[a[i]] += 1;
        }
        for(int i = 0 ; i < m ; i++){
            b[i] = in.nextInt();
//            ans.put(b[i], ans.getOrDefault(b[i], 0) + 1);
            c[b[i]] += 1 ;
        }
        for(int i = 0 ; i < 1005 ; i++){
            if(c[i] > 0 ) System.out.print(i + " ");
        }
    
    }
}