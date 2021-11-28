
package J07055.util;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Students> st = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Students a = new Students(i, in.nextLine(),Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            st.add(a);
        }
        Collections.sort(st);
        for(Students a : st){
            System.out.println(a);
        }
    }
}
