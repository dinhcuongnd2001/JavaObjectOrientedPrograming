package XauKyTu;
import java.util.*;

public class J03037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String res = "";
        for(int i = 0 ;i < x.length()-1; i++){
            if(x.charAt(i) == x.charAt(i+1)){
                i+=1;
                continue;
            }
            else res += String.valueOf(x.charAt(i));
        }
        int count = 0;
        
        System.out.println(count/2);
    }
}
