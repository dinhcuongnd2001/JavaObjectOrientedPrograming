
package J05022.util;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            Student a = new Student(in.nextLine(), in.nextLine() , in.nextLine() , in.nextLine());
            store.add(a);
        }
        int Q = Integer.parseInt(in.nextLine());
        while(Q-- >0){
            String Class = in.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + Class +":");
            for (Student x : store){
                if(x.getValue().equals(Class)){
                    System.out.println(x);
                }
            }
        }
    }
}
