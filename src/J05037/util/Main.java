
package J05037.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Cost> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Cost a = new Cost(i , in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            ans.add(a);
        }
        Collections.sort(ans);
        for(Cost x : ans){
            System.out.println(x);
        }
    }
}
