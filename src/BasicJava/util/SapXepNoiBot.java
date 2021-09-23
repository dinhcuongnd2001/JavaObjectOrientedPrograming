
package BasicJava.util;

import java.util.Scanner;

public class SapXepNoiBot {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n+5];
        for(int i = 0 ;i < n ; i++) a[i] = in.nextInt();
        boolean test;
        for(int i = 0 ; i < n ; i++){
            test = false ;
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(a[j] > a[j+1]){
                    test = true;
                    int tg = a[j] ;
                    a[j] = a[j+1] ;
                    a[j+1] = tg ;
                }
            }
            if(test){
                System.out.print("Buoc " + (i+1) + ": ");
                for(int k = 0 ; k < n ; k++)
                    System.out.print(a[k] + " ");
                System.out.println();
            }
        }
    }
}
