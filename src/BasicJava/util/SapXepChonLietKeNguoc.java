
package BasicJava.util;

import java.util.ArrayList;
import java.util.Scanner;

public class SapXepChonLietKeNguoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n + 5];
        String b = "";
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }
        ArrayList<String> store = new ArrayList<String>() ;
        int minIndex;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            b = "";
            for (int j = i + 1; j < n; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int tg = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tg;
            
            for (int k = 0; k < n; k++) {
               b = b + String.valueOf(a[k]) + " "; 
            }
            store.add(b) ;
        }
        for (int i = n-1 ; i >= 1 ; i--){
            System.out.println("Buoc " + i + ": " + store.get(i-1));
        }
    }
}
