
package BasicJava.util;

import java.util.Scanner;

public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int  [][] a = new int[n+5][n+5];
        for(int i = 1 ; i <= n ; i ++){
            for (int j = 1 ; j <= n ; j++){
                a[i][j] = in.nextInt();
                if(i < j && a[i][j] == 1){
                    System.out.println("(" + i +"," + j +")");
                }
            }
        }
    }
}
