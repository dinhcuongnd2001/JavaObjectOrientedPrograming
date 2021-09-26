
package J04013.util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ma = in.nextLine();
        String name = in.nextLine();
        double diem1 = in.nextDouble() , diem2 = in.nextDouble() , diem3 = in.nextDouble();
        double tong = diem1*2 + diem2 + diem3 ;
        ThongTinDiem a = new ThongTinDiem(ma , name ,tong);
        System.out.println(a);
    }
}
