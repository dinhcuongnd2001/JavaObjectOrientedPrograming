
package BasicJava.util;

import java.util.Scanner;

public class SoKhongLienKe {
    public static boolean check(String a){
        int sum = 0 ;
        for(int i = 1 ; i < a.length() -1 ; i++){
            if((Math.abs((a.charAt(i) - '0') - (a.charAt(i-1) - '0')) != 2 ) || (Math.abs((a.charAt(i) - '0') - (a.charAt(i+1) - '0')) != 2 ))
                return false;
            sum += (a.charAt(i) - '0') ;
        }
        sum = sum + (a.charAt(0) - '0') + (a.charAt(a.length()-1) - '0' );
        return (sum % 10 == 0);
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
