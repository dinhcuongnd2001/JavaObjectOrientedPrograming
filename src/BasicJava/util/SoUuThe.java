
package BasicJava.util;

import java.util.Scanner;

public class SoUuThe {
    private static boolean check(String a){
        if(a.charAt(0) == '0') return false;
        for(int i = 0 ; i < a.length() ; i++){
            if(!Character.isDigit(a.charAt(i))) return false;
        }
        return true;
    }
    
    private static void solve(String a){
        if(check(a) == false) System.out.println("INVALID");
        else{
            int soChan = 0  ,soLe = 0 ;
            for(int i = 0 ; i < a.length(); i++){
                if((a.charAt(i) - '0') % 2 == 0) soChan += 1;
                else soLe += 1;
            }
            if(soChan > soLe){
                if((soChan + soLe) % 2 == 0 ) System.out.println("YES");
                else System.out.println("NO");
            }
            else if(soChan == soLe) System.out.println("NO");
            else{
                if((soChan + soLe) % 2 == 1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- >0){
            String a = in.nextLine();
            solve(a);
        }
    }
}
