
package BasicJava.util;

import java.util.Scanner;

public class SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        byte n = In.nextByte();
        byte a[] = new byte[n+5];
        for(byte i = 0 ; i < n ; i++){
            a[i] = In.nextByte();
        }
        byte count = 1 ;
        boolean test ;
        for(byte i = 0 ; i < n - 1 ; i++){
            test = false ;
            for(int j = (i+1) ; j < n ; j++){
                if(a[i] > a[j]){
                    byte tg = a[i] ;
                    a[i] = a[j] ;
                    a[j] = tg ;
                    test = true ;
                }
            }
            if(test){
                System.out.printf("\nBuoc " + count + ": ");
                for(byte k = 0 ; k < n ; k++){
                    System.out.printf("%d ", a[k]);
                }
                count++;
            }

        }
    }
}
