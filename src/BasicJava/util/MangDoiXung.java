
package BasicJava.util;

import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        byte t = In.nextByte();
        while(t > 0){
            byte n = In.nextByte();
            int a[] = new int[n+5];
            for(byte i = 0 ; i < n ; i++)
                a[i] = In.nextInt();
            boolean test = check(a , n);
            if(test) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
    public static boolean check(int a[] , byte n){
        for(byte i = 0 ; i < n/2 ; i++){
            if(a[i] != a[n-i-1]) return false;
        }
        return true;
    }
}
