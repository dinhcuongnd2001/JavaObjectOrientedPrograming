
package J05025.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<GiangVien> ans = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            GiangVien a = new GiangVien(i , in.nextLine(), in.nextLine());
            ans.add(a);
        }
        Collections.sort(ans);
        for(GiangVien x : ans){
            System.out.println(x);
        }
    }
}
