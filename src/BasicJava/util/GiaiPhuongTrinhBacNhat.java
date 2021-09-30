
package BasicJava.util;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        double a = In.nextDouble();
        double b = In.nextDouble();
        if(a == 0){
            if(b != 0) System.out.println("VN");
            else{
                if(b == 0) System.out.println("VSN");
            }
        }
        else System.out.printf("%.2f", (-b)/a);
    }
}
