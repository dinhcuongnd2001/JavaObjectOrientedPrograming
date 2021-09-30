
package J05027.util;

import java.util.ArrayList;
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
        int Q = Integer.parseInt(in.nextLine());
        while(Q-- > 0){
            String a = in.nextLine() ;
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + a +":");
            for(GiangVien x : ans){
                if(x.getTen().contains(a.toUpperCase())){
                    System.out.println(x);
                }
            }
        }
    }
}
