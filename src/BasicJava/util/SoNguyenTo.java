
package BasicJava.util;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in) ;
        int t = In.nextInt() ;
        while(t>0){
            int ans ;
            ans = In.nextInt() ;
            if(isPrime(ans)) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }

    public static boolean isPrime(int n){
        if(n < 2) return false ;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false ;
        }
        return true ;
    }
}
