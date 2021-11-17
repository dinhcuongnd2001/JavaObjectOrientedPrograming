
package J07035.util;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Students> stStudentses = new ArrayList<>();
        ArrayList<Subjects> stSubjectses = new ArrayList<>();
        ArrayList<Marks> stMarkses = new ArrayList<>();
        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
//        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        for(int i= 0; i< n ; i++){
            Students a = new Students(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            stStudentses.add(a);
        }
//        in = new Scanner(new File("MONHOC.in"));
        int m = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < m ; i++){
            Subjects a = new Subjects(in.nextLine(), in.nextLine(), in.nextLine());
            stSubjectses.add(a);
        }
        
//        in = new Scanner(new File("BANGDIEM.in"));
        int k = Integer.parseInt(in.nextLine());
        for(int i = 0; i < k ; i++){
            Marks a= new Marks(in.nextLine());
            stMarkses.add(a);
        }
        for(Marks x : stMarkses){
            for(Students y : stStudentses){
                if(y.getId().equals(x.getA().getId())){
                    x.setA(y);
                    break;
                }
            }
            for(Subjects z : stSubjectses){
                if(z.getId().equals(x.getB().getId())){
                    x.setB(z);
                    break;
                }
            }
        }
        Collections.sort(stMarkses);
        int q = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < q ; i++){
            String idSub = in.nextLine();
            for(Subjects x : stSubjectses){
                if(x.getId().equals(idSub)){
                    System.out.println("BANG DIEM MON " + x.getName()+ ":");
                    break;
                }
            }
            for(Marks y : stMarkses){
                if(y.getB().getId().equals(idSub)){
                    System.out.println(y);
                }
            }
        }    
    }
}
