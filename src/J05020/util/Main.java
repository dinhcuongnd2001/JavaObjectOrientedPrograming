
package J05020.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> Store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            Student a = new Student(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            Store.add(a);
        }
        Collections.sort(Store);
        for(Student x : Store){
            System.out.println(x);
        }
    }
}
