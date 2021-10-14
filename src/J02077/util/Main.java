
package J02077.util;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<HoSoNhanVien> dsHoSoNhanVien = new ArrayList<>();
        ArrayList<PhongBan> dsPhongBan = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ;i < n ; i++){
            PhongBan a = new PhongBan(in.nextLine());
            dsPhongBan.add(a);
        }
        
        int m = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < m ; i++){
            HoSoNhanVien a = new HoSoNhanVien(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()));
            dsHoSoNhanVien.add(a);
        }
        
        for(HoSoNhanVien x : dsHoSoNhanVien){
            for(PhongBan y : dsPhongBan){
                if(x.getMaBan().equals(y.getMaP())){
                    x.setPhongBan(y.getTenP());
                    break;
                }
            }
//               System.out.println(x.getMaBan());
        }
        for(HoSoNhanVien x : dsHoSoNhanVien){
            System.out.println(x);
        }
        
    }
}
