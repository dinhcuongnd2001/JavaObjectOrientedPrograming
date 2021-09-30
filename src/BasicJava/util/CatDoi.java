
package BasicJava.util;

import java.util.Scanner;

public class CatDoi {
    public static boolean check(String a){
        String x = "0189";
        for(int i = 0 ; i < a.length() ; i++){
            String x1 = a.substring(i , i+1);
            if(!x.contains(x1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- > 0){
            String a = in.nextLine();
            if(check(a) == false) System.out.println("INVALID");
            else{
                String ans = "";
                for(int i = 0 ; i < a.length() ; i++){
                    if(Character.digit(a.charAt(i) , 10) == 1) ans += "1";
                    else ans += "0";
                }
                if(Long.parseLong(ans) == 0) System.out.println("INVALID");
                else System.out.println(Long.parseLong(ans));
            }
        }
    }
}
