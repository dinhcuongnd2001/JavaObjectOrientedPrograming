
package J07057.util;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Students> st = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Students a = new Students(i, in.nextLine(), Double.parseDouble(in.nextLine()),in.nextLine(), in.nextLine());
            st.add(a);
        }
        Collections.sort(st);
        for(Students a: st){
            System.out.println(a);
        }
    }
}
