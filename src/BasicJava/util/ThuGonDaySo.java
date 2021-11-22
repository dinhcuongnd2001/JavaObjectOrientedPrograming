
package BasicJava.util;

import java.util.*;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayDeque<Integer> ans = new ArrayDeque<>();
        int a[] = new int[n+5];
        a[0] = in.nextInt();
        ans.push(a[0]);
        for(int i = 1; i < n ; i++){
            a[i] = in.nextInt();
            if(ans.size() > 0 && (ans.getFirst()+a[i]) % 2 == 0){
                ans.pop();
            }
            else ans.push(a[i]);
        }
        System.out.println(ans.size());
   }
}
