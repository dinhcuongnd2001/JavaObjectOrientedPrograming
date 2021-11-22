package BasicJava.util;

import java.util.*;
import java.math.*;
public class ChiaHet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            BigInteger a ,b ;
            a= in.nextBigInteger();
            b= in.nextBigInteger();
            if(a.mod(b).intValue() == 0 || b.mod(a).intValue() == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO"); 
            }  
        }
    }
}
