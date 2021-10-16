
package J05014.util;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Teacher> listTeachers = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i =1 ; i <= n ; i++){
            Teacher a= new Teacher(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            listTeachers.add(a);
        }
        Collections.sort(listTeachers);
        for(Teacher x : listTeachers){
            System.out.println(x);
        }
    }
}
