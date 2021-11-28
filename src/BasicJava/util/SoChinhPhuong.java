
package BasicJava.util;
import java.util.*;
import java.io.*;
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- >0){
            long x = in.nextLong();
            int a = (int)Math.sqrt(x);
            if(a*a == x){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
