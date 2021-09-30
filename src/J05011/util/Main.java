
package J05011.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<GameThu> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            GameThu a = new GameThu(in.nextLine() , in.nextLine() , in.nextLine() , in.nextLine());
            ans.add(a);
        }
        Collections.sort(ans);
        for(GameThu x : ans){
            System.out.println(x);
        }
    }
}