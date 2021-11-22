package BasicJava.util;

import java.util.*;

public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean check = true;
        int a[] = new int [205], res[] = new int [205];
        for(int i = 0 ; i < n ; i++){
            a[i] = in.nextInt();
            res[a[i]] += 1;
        }
        for(int i = 1 ; i <= a[n-1] ; i++){
            if(res[i] == 0){
                System.out.println(i);
                check = false;
            }
        }
        if(check) System.out.println("Excellent!");
    }
}
