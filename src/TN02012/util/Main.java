package TN02012.util;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        Scanner in = new Scanner(System.in);
        ArrayList<PhongBan> stPhongBans = new ArrayList<>();
        ArrayList<NhanVien> stNhanViens = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ;i++){
            PhongBan a = new PhongBan(in.nextLine());
            stPhongBans.add(a);
        }
        n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            NhanVien a = new NhanVien(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            stNhanViens.add(a);
        }
        for(NhanVien x : stNhanViens){
            for(PhongBan y : stPhongBans){
                if(y.getMaPhong().equals(x.getMaPhongBan())){
                    x.setP(y);
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
