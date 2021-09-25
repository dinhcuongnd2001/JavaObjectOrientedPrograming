
package J05004.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<SinhVien> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ;i <= n ; i++){
            SinhVien a = new SinhVien(i , in.nextLine() , in.nextLine() , in.nextLine() , Float.parseFloat(in.nextLine()));
            a.chuanHoa();
            store.add(a);
        }
        for(SinhVien x : store){
            System.out.println(x);
        }
    }
}