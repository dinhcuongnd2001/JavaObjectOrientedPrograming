
package J04006.util;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinhVien a = new SinhVien(in.nextLine(), in.nextLine() , in.nextLine() , in.nextFloat());
        a.chuanHoa();
        System.out.println(a);
    }
}
