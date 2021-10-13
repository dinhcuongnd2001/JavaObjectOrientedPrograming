
package J05058.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Scores> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while(n-- >0){
            Scores a = new Scores(in.nextLine(),in.nextLine(), Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            ans.add(a);
        }
        Collections.sort(ans);
        for(Scores x : ans){
            System.out.println(x);
        }
    }
}
