
package BasicJava.util;

import java.util.Scanner;

public class SoDep1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while(test -- > 0){
            String a = in.nextLine();
            boolean check = true ;
            for(int i = 0 ; i <= a.length()/2 ; i++){
                if(a.charAt(i) != a.charAt(a.length() - i -1) || (a.charAt(i) - '0') % 2 != 0 ){
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
        }
    }
}
