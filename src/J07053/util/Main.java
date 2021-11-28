package J07053.util;
import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Candidate> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Candidate a = new Candidate(i, in.nextLine(), in.nextLine(),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            store.add(a);
        }
        for(Candidate a : store){
            System.out.println(a);
        }
    }
}
