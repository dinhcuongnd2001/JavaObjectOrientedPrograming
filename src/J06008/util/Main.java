package J06008.util;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner (System.in);
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        LinkedList<Subjects> stSubjectses = new LinkedList<>();
        ArrayList<Professors> stProfessorses = new ArrayList<>();
        LinkedList<Grade> stGrades = new LinkedList<>();
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
        String idProfessor = in.nextLine();
        System.out.print("Giang vien: ");
        for(Grade x : stGrades){
            if(x.getP().getId().equals(idProfessor)){
                System.out.println(x.getP().getName());
                break;
            }
        }
        for(Grade x : stGrades){
            if(x.getP().getId().equals(idProfessor)){
                System.out.println(x.getS().getName() + " " + x.getTotal());
            }
        }
        System.out.println("Tong: " + String.format("%.2f", Grade.store.get(idProfessor)));
    }
}
