
package BasicJava.util;

import java.util.*;
import java.io.*;

public class HinhSao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> ans = new HashMap<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i < n ; i++){
            String x[] = in.nextLine().split(" ");
            int u = Integer.parseInt(x[0]);
            int v = Integer.parseInt(x[1]);
            ans.put(u, ans.getOrDefault(u, 0) + 1);
            ans.put(v,ans.getOrDefault(v    , 0)+1);
        }
        boolean check = true;
        for(int i = 1 ; i <= n ; i++){
            if(ans.get(i) == null) continue;
            if(ans.get(i) == n-1){
                check = false;
                break;
            }
        }
        if(check) System.out.println("No");
        else System.out.println("Yes");
    }
}
