
package BasicJava.util;
import java.io.*;
import java.util.*;
public class BienSoDep {
    public static boolean check1(int a){
        String x = String.valueOf(a);
        for(int i = 0 ; i < x.length()-1; i++){
            if((x.charAt(i) - '0') >= (x.charAt(i+1) - '0'))return false;
        }
        return true;
    }
    public static boolean check2(int a){
        String x = String.valueOf(a);
        for(int i = 0 ; i < x.length()-1; i++){
            if((x.charAt(i) - '0') != (x.charAt(i+1) - '0'))return false;
        }
        return true;
    }   
    public static boolean check3(int a){
        String x = String.valueOf(a);
        for(int i = 0 ; i < 2; i++){
            if((x.charAt(i) - '0') != (x.charAt(i+1) - '0'))return false;
        }
        if((x.charAt(3) - '0') != (x.charAt(4) - '0')) return false;       
        return true;
    }
    public static boolean check4(int a){
        String x = String.valueOf(a);
        for(int i = 0 ; i < x.length(); i++){
            if(((x.charAt(i) - '0') != 6) &&((x.charAt(i) - '0') != 8)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//    Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0){
            String x = in.nextLine();
            int a = Integer.parseInt(x.substring(5,8))*100 + Integer.parseInt(x.substring(9));
            if(check1(a) || check2(a) || check3(a) || check4(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
