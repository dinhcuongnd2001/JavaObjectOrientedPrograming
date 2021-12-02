package J07025.util;
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("KHACHHANG.in"));
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Clients> st = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            Clients x = new Clients(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            st.add(x);
        }
        Collections.sort(st);
        for(Clients x : st){
            System.out.println(x);
        }
    }
}
