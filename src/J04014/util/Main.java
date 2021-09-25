
package J04014.util;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- >0){
            PhanSo a = new PhanSo(in.nextLong() , in.nextLong());
            PhanSo b = new PhanSo(in.nextLong() , in.nextLong());
            a.rutGon(); b .rutGon();
            PhanSo c = PhanSo.tongPhanSo(a, b) ;
            PhanSo val1 = PhanSo.phepTinhC(c);
            val1.rutGon();
            PhanSo val2 = PhanSo.phepTinhD(a, b, c);
            val2.rutGon();
            System.out.print(val1 + " " + val2 + "\n");
        }
        
    }
}
