
package TipsForJava;
import java.util.*;
public class TipsForDouble {
    public static void main(String[] args) {
        /*
        lam tron den n chu so thap phan
        Math.round()-> lam tron
        Math.ceil()-> lan tron len
        Ma5
        */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        //MathRound tra ve long =>> can phai chia cho 1 so thap phan: 10^n.0;
        Double x = Math.round((a/3.0) * 100) /100.0;
        System.out.println(x);
    }
}
