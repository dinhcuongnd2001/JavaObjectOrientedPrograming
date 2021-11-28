package BasicJava.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class XauDayDu {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- > 0)
        {
            String x = in.nextLine().toLowerCase();
            int k = Integer.parseInt(in.nextLine());
            if(x.length() < 26){
                System.out.println("NO");
            }
            else{
                int a[] = new int[200];
                for(int i = 0 ; i < x.length(); i++){
                    a[(int)x.charAt(i)] += 1;
                }
                int count = 0 ;
                for(int i = 0 ; i < 200;i++){
                    if(a[i] > 0){
                        count += 1;
                       
                    }
                }
                if(k >= 26 - count){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}
