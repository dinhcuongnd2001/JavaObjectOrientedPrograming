
package BasicJava.util;

import java.util.Scanner;

public class SapXepChen {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []a = new int[n+5];
        for(int i = 0 ; i < n ; i++) a[i] = in.nextInt();
        int key , j;
        System.out.println("Buoc 0: " + a[0]);
        for(int i = 1 ; i < n ; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
            System.out.print("Buoc " + i + ": ");
            for (int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
