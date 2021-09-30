
package J05032.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ThongTin> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            ThongTin a = new ThongTin(in.nextLine());
            ans.add(a);
        }
        Collections.sort(ans);
        System.out.println(ans.get(ans.size()-1));
        System.out.println(ans.get(0) );
    }
}
