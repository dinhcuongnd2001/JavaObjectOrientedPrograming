
package J04012.util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NhanVien a = new NhanVien(1 , in.nextLine() , Long.parseLong(in.nextLine()) , Long.parseLong(in.nextLine()) , in.nextLine());
        System.out.println(a);
    }
}
