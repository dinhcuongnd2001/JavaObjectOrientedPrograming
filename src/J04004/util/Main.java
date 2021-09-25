
package J04004.util;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhanSo a = new PhanSo(in.nextLong() , in.nextLong());
        PhanSo b = new PhanSo(in.nextLong() , in.nextLong());
        a.rutGon(); b .rutGon();
        PhanSo c = PhanSo.tongPhanSo(a, b) ;
        c.rutGon();
        System.out.println(c);
    }
}
