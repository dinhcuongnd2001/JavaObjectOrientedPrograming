
package BasicJava.util;

import java.util.Scanner;

public class LietKeToHop2 {
     static int n, k, count = 0;
    static int[] a = new int[15];

    public static void display() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    public static void Try(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                count += 1;
                display();
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        Try(1);
        System.out.println("\nTong cong co " + count + " to hop");
    }
}
