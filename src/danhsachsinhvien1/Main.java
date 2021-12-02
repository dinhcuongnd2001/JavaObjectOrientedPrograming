
package danhsachsinhvien1;
import java.util.*;
import java.io.*;
import java.text.*;

class SinhVien {
    private String id, name, grade;
    private Date yob;
    private float GPA;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public SinhVien(int i, String name, String grade, String yob, float GPA) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", i);
        this.name = name;
        this.grade = grade;
        this.yob = format.parse(yob);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + grade + " " + format.format(yob) + " " + String.format("%.2f", GPA);
    }
}
public class Main {
    public static void main(String[] args) throws  IOException, ClassNotFoundException, ParseException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> st = (ArrayList<SinhVien>) in.readObject();
        
//        ArrayList<SinhVien> st = new ArrayList<>();
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
//        int n = Integer.parseInt(in.nextLine());
//        for(int i = 1; i <= n ; i++){
//            SinhVien a = new SinhVien(i, in.nextLine(), in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()));
//            st.add(a);
//        }
        for(SinhVien x : st){
            System.out.println(x);
        }
    }
}
