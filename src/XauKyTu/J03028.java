package XauKyTu;
import java.util.*;
public class J03028 {
    static HashMap<String , Integer> st = new HashMap<>();
    static String a[] = new String [30];
    
    public static int sum(String x){
        int res = 0 ;
        for(int i = 0; i < x.length(); i++){
            res += st.get(String.valueOf(x.charAt(i)));
        }
        return res;
    }
    
    public static String rotate(String x, int sum){
        String res = "";
        for(int i = 0 ; i < x.length();i++){
            int index = ((x.charAt(i) - 'A') + sum) % 26;
            res = res+ a[index];
        } 
        return res;
    }
    
    public static String Merge(String x , String y){
        String res = "" ;
        for(int i = 0; i < x.length(); i++){
            int index = (st.get(String.valueOf(x.charAt(i))) + st.get(String.valueOf(y.charAt(i)))) % 26;
            res += a[index];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int val = 65;
        for(int i = 0; i < 26; i++){
            a[i] = String.valueOf((char)val) ;
            val += 1;
            st.put(a[i], i);
        }
        while(n-- > 0){
            String x = in.nextLine();
            String subX1 = x.substring(0,x.length()/2),
                   subX2 = x.substring(x.length()/2);
            subX1 = rotate(subX1, sum(subX1));
            subX2 = rotate(subX2,sum(subX2));
            System.out.println(Merge(subX1, subX2));
        }
    }
}
