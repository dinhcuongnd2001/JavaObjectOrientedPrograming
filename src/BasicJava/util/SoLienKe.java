
package BasicJava.util;

import java.util.Scanner;

public class SoLienKe {
    
    public static boolean check(String a){
        for(int i = 1 ; i < a.length() -1 ; i++){
            if((Math.abs((a.charAt(i) - '0') - (a.charAt(i-1) - '0')) != 1 ) || (Math.abs((a.charAt(i) - '0') - (a.charAt(i+1) - '0')) != 1 ))
                return false;
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
