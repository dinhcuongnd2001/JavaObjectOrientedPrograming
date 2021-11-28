package BasicJava.util;
import java.io.*;
import java.util.*;
import java.math.*;
public class TachDoiVaTinhTong {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        String x = in.next();
        while(x.length() > 1){
            int m = x.length()/2;
            String x1 = x.substring(0,m), x2 = x.substring(m);
            BigInteger a = new BigInteger(x1);
            BigInteger b = new BigInteger(x2);
            x = a.add(b).toString();
            System.out.println(x);
        }
    }
}
