
package BasicJava.util;

import java.util.Scanner;

public class KiemTraSoFibonaci {
    static long f[] = new long[100] ;
    public static void creatFibo(){
        f[1] = 1;
        f[2] = 1;
        for(int i = 2 ; i <= 92 ; i++){
            f[i] = f[i-2] + f[i-1];
        }
    }
    public static void main(String[] args) {
        creatFibo();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while((t--) > 0){
            long n = in.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(long n){
        for(int i = 0 ; i <= 92 ; i++){
            if(n == f[i]) return true ;
        }
        return false;
    }
}
