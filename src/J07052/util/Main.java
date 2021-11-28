
package J07052.util;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("THISINH.in"));
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Students> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        Students.creatBonusMark();
        for(int i = 1 ; i <= n ; i++){
            Students a = new Students(in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            store.add(a);
        }
        Collections.sort(Students.store,Comparator.reverseOrder());
        int k = Integer.parseInt(in.nextLine());
        Students.standard = Students.store.get(k-1);
        System.out.println(String.format("%.1f", Students.standard));
        Collections.sort(store);
        for(Students x : store){
            if(x.getTotal() >= Students.standard){
                x.setStatus("TRUNG TUYEN");
            }
            else{
                x.setStatus("TRUOT");
            }
            System.out.println(x);
        }
    }
}
