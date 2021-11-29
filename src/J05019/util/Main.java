
package J05019.util;
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        LinkedList<AverageRainFall> st = new LinkedList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n ; i++){
            AverageRainFall x = new AverageRainFall(in.nextLine(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()));
            st.add(x);
        }
        for(AverageRainFall x : st){
            x.setAverageRain();
            System.out.println(x);
        }
    }
}
