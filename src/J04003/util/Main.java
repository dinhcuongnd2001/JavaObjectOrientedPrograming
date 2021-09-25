
package J04003.util;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhanSo a = new PhanSo(in.nextLong() , in.nextLong());
        a.rutGon();
        System.out.println(a);
    }
}
