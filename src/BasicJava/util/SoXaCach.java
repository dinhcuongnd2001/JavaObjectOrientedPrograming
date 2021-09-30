
package BasicJava.util;

import java.util.Arrays;
import java.util.Scanner;

public class SoXaCach {
    static int a[] = new int[15];
    static boolean check[] = new boolean[15];
    
    public static boolean condition(int n){
        for(int i = 2 ; i <= n ; i++){
            if(Math.abs(a[i] - a[i-1]) == 1) return false;
        }
        return true;
    }
    
    public static void Try(int i, int n){
        for(int j = 1 ; j <= n ; j++){
            if(!check[j]){
                a[i] = j ;
                check[j] = true;
                if(i == n){
                    if(condition(n)){
                        for(int k = 1 ; k <= n ; k++){
                            System.out.print(a[k]);
                        }
                        System.out.println("");
                    }
                }
                else Try(i+1 , n);
                check[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            Try(1 , n);
        }
    }
}
