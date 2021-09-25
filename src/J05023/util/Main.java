package J05023.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Student> store = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            Student a = new Student(in.nextLine() , in.nextLine() , in.nextLine() , in.nextLine());
            store.add(a);
        }
        int Q = Integer.parseInt(in.nextLine());
        while(Q-- >0){
            int grade = Integer.parseInt(in.nextLine());
            System.out.println("DANH SACH SINH VIEN KHOA " + grade + ":");
            for ( Student x : store){
                if(Integer.valueOf(x.getGrade()) == grade % 100) 
                    System.out.println(x);
                
            }
//            for ( Student x : store){
//                System.out.println(x);
//                
//            }
        }
    }
}
