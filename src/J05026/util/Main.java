
package J05026.util;

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
            String a = in.nextLine() , res = "";
            String b[] = a.split(" ");
            for(String i : b){
                res += i.substring(0,1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for(GiangVien x : ans){
                if(x.getBoMon().equals(res)) 
                    System.out.println(x);
            }
        }
    }
}
