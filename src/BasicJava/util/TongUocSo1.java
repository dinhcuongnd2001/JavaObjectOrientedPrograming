
package BasicJava.util;

import java.util.Arrays;
import java.util.Scanner;


public class TongUocSo1 {
    public static int []isPrime = new int[2000005];
    public static boolean []check = new boolean[2000005];
    public static int k = 0 ;

    public static void SanNguyenTo(){
         Arrays.fill(check , true);
         check[0] = false;
         check[1] = false;
        for(int i = 2 ; i <= Math.sqrt(2000005) ; i++){
            if(check[i]){
                isPrime[k] = i ;
                for(int j = i * i ; j < 2000005 ; j += i){
                    check[j] = false ;
                }
                k++;
            }
        }
    }

    public static int result(int n){
        int sum = 0;
        int k = 0 ;
        while(n != 1){
            while(n % isPrime[k] == 0){
                sum += isPrime[k];
                n /= isPrime[k];
            }
            if(check[n]){
                sum += n;
                break;
            }
            k++;
        }
        return sum ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SanNguyenTo();
        int n = in.nextInt();
        int []a = new int[n+5] ;
        for(int i = 0 ; i < n ; i++)
            a[i] = in.nextInt();
        long ans = 0;
        for(int i = 0 ; i < n ; i++){
            if(check[a[i]]) ans += a[i] ;
            else {
                ans += result(a[i]);
            }
        }
        System.out.println(ans);
    }
}
