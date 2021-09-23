package BasicJava.util;

import java.util.Scanner;

public class SapXepChon {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        int a[] = new int[n + 5];
        int count = 1, minIndex;

        for (int i = 0; i < n; i++) {
            a[i] = In.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;

                }
            }
            int tg = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tg;

            System.out.printf("\nBuoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.printf("%d ", a[k]);

            }
        }
    }
}
