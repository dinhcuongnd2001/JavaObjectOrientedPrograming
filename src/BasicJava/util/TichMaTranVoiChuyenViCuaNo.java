
package BasicJava.util;

import java.util.Scanner;

public class TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i = 1 ; i <= test ; i++){
            
            int n = in.nextInt();
            int m = in.nextInt();
            int a [][] = new int [n+3][m+3];
            int b [][] = new int [m+3][n+3];
            for(int k = 0 ; k < n ; k++){
                for(int l = 0 ; l < m ; l++){
                    a[k][l] = in.nextInt();
                    b[l][k] = a[k][l];
                }
            }
            int ans[][] = new int[n+3][n+3];
            
            for(int k = 0 ;k < n ; k++){
                for(int l = 0; l < n ; l++){
                    for(int q = 0 ; q < m; q++){
                        ans[k][l] += a[k][q] * b[q][l];
                    }
                }
            }
            System.out.println("Test " + i +":");
            for(int j = 0 ;j < n ; j++){
                for(int k = 0 ; k < n ; k++){
                    System.out.print(ans[j][k] + " ");
                }
                System.out.println("");
            }
        }
    }
}
