
package J06007.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner (System.in);
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Subjects> stSubjectses = new ArrayList<>();
        ArrayList<Professors> stProfessorses = new ArrayList<>();
        ArrayList<Grade> stGrades = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n; i++){
            Subjects a = new Subjects(in.nextLine());
            stSubjectses.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < m ; i++){
            Professors a = new Professors(in.nextLine());
            stProfessorses.add(a);
        }
        int k = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < k; i++){
            Grade a = new Grade(in.nextLine());
            stGrades.add(a);
        }
        for(Grade x : stGrades){
            for(Professors y : stProfessorses){
                if(x.getP().getId().equals(y.getId())){
                    x.setP(y);
                    break;
                }
            }
            for(Subjects z : stSubjectses){
                if(x.getS().getId().equals(z.getId())){
                    x.setS(z);
                    break;
                }
            }
        }
        for(Professors x : stProfessorses){
            System.out.println(x.getName() + " " + String.format("%.2f",Grade.store.get(x.getId())));
        }
    }
}
