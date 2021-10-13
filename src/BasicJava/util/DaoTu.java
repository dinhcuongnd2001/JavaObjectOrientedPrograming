
package BasicJava.util;

import java.util.Scanner;

public class DaoTu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- >0){
            String a[] = in.nextLine().split(" ");
            for(int i = 0 ; i < a.length ;i++){
                StringBuilder x = new StringBuilder(a[i]);
                System.out.print(x.reverse().toString() + " ");
            }
            System.out.println("");
        }
    }
}
