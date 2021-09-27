
package BasicJava.util;

import java.util.Scanner;

public class SoDep3 {
    public static boolean condition(String a){
        String snt = "2357" ;
        for(int i = 0 ; i < a.length() ; i++){
            if(snt.indexOf(a.charAt(i)) == -1)
                return false ;
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test-- >0) {
            String a = in.nextLine();
            boolean check = true;
            for(int i = 0 ; i <= a.length()/2 ; i++){
                if(a.charAt(i) != a.charAt(a.length()-i-1)){
                    System.out.println("NO");
                    check = false ;
                    break;
                }
            }
            if(check){
                if(condition(a)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
