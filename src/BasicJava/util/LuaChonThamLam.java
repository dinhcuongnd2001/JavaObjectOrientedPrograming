package BasicJava.util;

import java.io.*;
import java.util.*;
import java.math.*;

public class LuaChonThamLam {

    public static void handle(int n, int s) {
        if(n == 1 && s == 1){
            System.out.println("1 1");
        }
        else{
            int min[] = new int[n];
            int max[] = new int[n];
            int sum = s;
            for (int i = n - 1; i >= 0; i--) {
                if (sum > 9) {
                    min[i] = 9;
                    sum -= 9;
                } else {
                    if (i == 0) {
                        min[i] = sum;
                    } else {
                        min[i] = sum - 1;
                        sum = 1;
                    }
                }
            }

            sum = s;
            for (int i = 0; i < n; i++) {
                if (sum > 9) {
                    max[i] = 9;
                    sum -= 9;
                } else {
                    max[i] = sum;
                    sum = 0;
                }
            }
            BigInteger resultMin = BigInteger.valueOf(0) , resultMax = BigInteger.valueOf(0);
            for (int i = 0; i < n; i++) {
                resultMin = resultMin.multiply(BigInteger.valueOf(10));
                resultMax = resultMax.multiply(BigInteger.valueOf(10));
                resultMin = resultMin.add(BigInteger.valueOf(min[i]));
                resultMax = resultMax.add(BigInteger.valueOf(max[i]));
            }
            System.out.println(resultMin + " " + resultMax);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), s = in.nextInt();
        if (9 * n < s) {
            System.out.println("-1 -1");
        } else if ((n > 1 && s == 0) || ( (n == 1 && s > 9))) {
            System.out.println("-1 -1");
        } else {
            handle(n, s);
        }
    }
}
