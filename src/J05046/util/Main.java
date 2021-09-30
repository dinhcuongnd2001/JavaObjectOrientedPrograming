
package J05046.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<MatHang> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            MatHang a = new MatHang(in.nextLine() , Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            ans.add(a);
        }
        for(MatHang x : ans){
            System.out.println(x);
        }
    }
}
