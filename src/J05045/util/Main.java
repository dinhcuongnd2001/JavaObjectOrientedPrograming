
package J05045.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<CanBoCongNhanVien> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            CanBoCongNhanVien  a = new CanBoCongNhanVien(i, in.nextLine(),in.nextLine(),Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            ans.add(a);
        }
        Collections.sort(ans);
        for(CanBoCongNhanVien x : ans){
            System.out.println(x);
        }
    }
}
