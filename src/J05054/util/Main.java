
package J05054.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            
            Student a = new Student(i,in.nextLine(),Double.parseDouble(in.nextLine()));
            ans.add(a);
        }
        for(Student x : ans){
            System.out.println(x + " " + x.getRank());
        }
    }
}
