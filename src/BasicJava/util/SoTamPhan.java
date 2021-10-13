
package BasicJava.util;

import java.util.Scanner;

public class SoTamPhan {
    public static boolean check(String s){
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != '1' && s.charAt(i) != '0' && s.charAt(i) != '2') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- >0){
            String a = in.nextLine();
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }  
    }
}
