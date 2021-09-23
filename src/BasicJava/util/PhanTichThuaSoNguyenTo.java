
package BasicJava.util;

import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        byte t = In.nextByte();
        for(byte i = 1; i <= t ; i++){
            int n = In.nextInt();
            System.out.printf("Test %d: ",i);
            solve(n);
            System.out.printf("\n");
        }
    }
    public static void solve(int n){
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            byte count = 0 ;
            while(n % i == 0){
                n /= i;
                count++;
            }
            if(count > 0 ) System.out.printf("%d(%d) ", i , count);
        }
        if(n > 1) System.out.printf("%d(1)", n);
    }
}
