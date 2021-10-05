
package J05042.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Information> ans = new ArrayList<>();
        
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Information a = new Information(in.nextLine(),in.nextInt() , in.nextInt());
            ans.add(a);
            in.nextLine();
        }
        Collections.sort(ans);
        for(Information x : ans){
            System.out.println(x);
        }
    }
}
