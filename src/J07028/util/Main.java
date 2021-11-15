package J07028.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("MONHOC.in"));
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Subjects> stSubjectses = new ArrayList<>();
        ArrayList<Professor> stProfessors = new ArrayList<>();
        ArrayList<StandardTime> stStandardTimes = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            Subjects a = new Subjects(in.nextLine());
            stSubjectses.add(a);
        }
        in = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            Professor a = new Professor(in.nextLine());
            stProfessors.add(a);
        }
        in = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            StandardTime a = new StandardTime(in.nextLine());
            stStandardTimes.add(a);
        }
        
        for(StandardTime x : stStandardTimes){
            for(Professor y : stProfessors){
                if(y.getId().equals(x.getP().getId())){
                    x.setP(y);
                    break;
                }
            }
        }
        for(Professor x : stProfessors){
            System.out.println(x.getName()+ " " + String.format("%.2f",StandardTime.store.get(x.getId())));
        }
    }
}
