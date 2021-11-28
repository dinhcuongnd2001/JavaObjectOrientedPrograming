package BasicJava.util;
import java.util.*;
import java.math.*;
public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- >0){
            String a = in.nextLine(), b = in.nextLine();
            if(a.equals(b)) System.out.println("-1");
            else{
                System.out.println(Math.max(a.length(), b.length()));
            }
        }
                
    }
}
