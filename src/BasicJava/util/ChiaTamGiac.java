
package BasicJava.util;

import java.util.Scanner;

public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt() , h = in.nextInt();
            for(int i = 1 ; i < n ; i++){
                System.out.printf("%.6f " , h * (Math.sqrt((double)i/n)));
            }
            System.out.println();
        }
    }
}
