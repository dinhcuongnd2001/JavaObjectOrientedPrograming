
package BasicJava.util;

import java.util.Scanner;

public class SoDep2 {
    public static int sum(String a){
        int ans = 0 ;
        for(int i = 0 ; i < a.length() ; i++){
            ans += (a.charAt(i) - '0');
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        while( test -- >0){
            String a = in.nextLine();
            if(a.charAt(0) != '8' && a.charAt(a.length() - 1) != '8'){
                System.out.println("NO");
            }
            else{
                boolean check = true ;
                int sum = 0 ;
                for(int i = 0 ; i <= a.length()/2 ; i++){
                    if(a.charAt(i) != a.charAt(a.length() - i - 1)) {
                        System.out.println("NO");
                        check = false;
                        break;
                    }
                }
                if(check){
                    if(sum(a) % 10 == 0) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}
