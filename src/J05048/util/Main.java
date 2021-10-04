
package J05048.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SanPham> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            SanPham a = new SanPham(in.nextLine(), Long.parseLong(in.nextLine()));
            ans.add(a);
        }
        for(SanPham x : ans){
            System.out.println(x);
        }
    }
}
