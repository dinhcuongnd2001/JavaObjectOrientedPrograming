
package BasicJava.util;

import java.util.Scanner;

public class ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test-- >0){
            String a = in.nextLine();
            a = a.trim();
            a = a.toLowerCase();
            String [] s = a.split("\\s+");
            String s1 = "";
            String s2 = "";
            for(int i = 0 ; i < s.length ; i++) {
                if(i == 0){
                    s1 = s1.concat(s[i].toUpperCase());
                }
                else{
                    s2 = s2.concat(s[i].substring(0,1).toUpperCase() + s[i].substring(1));
                    if(i == s.length - 1){
                        s2 = s2 + ", " ;
                    }
                    else{
                        s2 = s2 + " ";
                    }
                }
            }
            System.out.println(s2 + s1);
        }

    }
}
