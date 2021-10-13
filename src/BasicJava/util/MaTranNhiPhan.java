package BasicJava.util;

import java.util.Scanner;

public class MaTranNhiPhan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n + 5][n + 5];
        int res = 0, count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextInt();
                if (a[i][j] == 1) {
                    count++;
                }
            }
            if (count > (3 - count)) {
                res += 1;
            }
        }
        System.out.println(res);

    }
}
