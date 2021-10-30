
package J07010.util;
import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("SV.in"));
        ArrayList<Student>store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Student a = new Student(i, in.nextLine(), in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()));
            store.add(a);
        }
        for(Student x : store){
            System.out.println(x);
        }
    }
}
