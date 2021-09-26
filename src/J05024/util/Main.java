
package J05024.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        while(n-- >0){
            Student p = new Student(in.nextLine() , in.nextLine() , in.nextLine() , in.nextLine());
            a.add(p);
        }
        
        int Q = Integer.parseInt(in.nextLine());
        while(Q-- > 0){
            String s = in.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            s = s.trim();
            s = s.replaceAll("\\s+" , " ");
            s = s.toLowerCase();
            if(s.equals("ke toan")) s = "DCKT";
            else if(s.equals("cong nghe thong tin")) s = "DCCN";
            else if(s.equals("an toan thong tin")) s = "DCAT";
            else if(s.equals("vien thong")) s = "DCVT";
            else s = "DCDT";
            
            if(s.equals("DCCN") ||s.equals("DCAT")){
                for(Student x : a){
                    if(x.maijor().equals(s) && !(x.grade().equals("E")))
                        System.out.println(x);
                }
            }
           
            else{
                for(Student x : a){
                    if(x.maijor().equals(s))
                        System.out.println(x);
                }
            }
        }
    }
}
