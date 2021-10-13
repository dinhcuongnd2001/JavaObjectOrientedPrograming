
package BasicJava.util;

import java.util.Scanner;

public class ChuSo4VaChuSo7 {
    public static boolean check(String a){
        int count = 0 ;
        for(int i = 0 ; i < a.length() ;i++){
            if(a.charAt(i) == '4' || a.charAt(i) == '7') count += 1;
        }
        return (count == 4 || count == 7);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if(check(a)) System.out.println("YES");
        else System.out.println("NO");
    }
}
