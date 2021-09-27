
package BasicJava.util;

import java.util.Scanner;

public class ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-- >0){
            String a = in.nextLine();
            a = a.trim();
            a = a.toLowerCase();
            String [] str1 = a.split("\\s+");
            String str2 = "";
            for(String x : str1){
                    str2 = str2.concat(x.substring(0 , 1).toUpperCase() + x.substring(1)) ;
                    str2 = str2.concat(" ");
            }
            System.out.println(str2);

        }
    }
}
