
package J05075.uitl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ThongTinSinhVien> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            ThongTinSinhVien a = new ThongTinSinhVien(in.nextLine(), in.nextLine(), in.nextLine());
            ans.add(a);
        }
        
        for(int i = 0 ; i < n ; i++){
            String s[] = in.nextLine().split(" ");
            for(ThongTinSinhVien a : ans){
                if(a.getMa().equals(s[0])){
                    a.setDiem(s[1]);
                }
            }
        }
        String x = in.nextLine();
        for(ThongTinSinhVien a : ans){
            if(a.getLop().equals(x)){
                System.out.println(a);
            }
        }
    }
}
