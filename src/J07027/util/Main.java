package J07027.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Students> stStudentses = new ArrayList<>();
        ArrayList<Topic> stTopics = new ArrayList<>();
        ArrayList<Group> stGroups = new ArrayList<>();
        Scanner in = new Scanner(new File("SINHVIEN.in"));
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i< n ; i++){
            Students a = new Students(in.nextLine(), in.nextLine(), in.nextLine());
            stStudentses.add(a);
        }
        in = new Scanner(new File("BAITAP.in"));
        int m = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < m ; i++){
            Topic a= new Topic(in.nextLine());
            stTopics.add(a);
        }
        in = new Scanner(new File("NHOM.in"));
        for(int i = 0 ; i < n ; i++){
            Group a = new Group(in.next(), in.nextInt());
            stGroups.add(a);
        }
        
        for(Group x : stGroups){
            for(Students y : stStudentses){
                if(x.getS().getId().equals(y.getId())){
                    x.setS(y);
                    break;
                }
            }
        }
        
        Collections.sort(stGroups);
        for(Group x : stGroups){
            System.out.println(x);
        }
        
    }
}
