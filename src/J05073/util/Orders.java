
package J05073.util;
import java.util.*;

public class Orders {
    private String maDon;
    private long donGia, soLuong;
    private double thue, giaVanChuyen, giaBan, giamThue;
    private static HashMap<String, Double> bangThue = new HashMap<>();
    private static HashMap<String, Double> bangGiaVanChuyen = new HashMap<>();
    public Orders(String maDon, long donGia, long soLuong) {
        this.maDon = maDon;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.thue = bangThue.get(this.maDon.substring(0,1));
        this.giaVanChuyen = bangGiaVanChuyen.get(this.maDon.substring(0,1));
        if(this.maDon.substring(this.maDon.length()-1, this.maDon.length()).equals("C")){
            this.giamThue = 0.95;
        }
        else this.giamThue = 1;
        this.giaBan = (this.donGia + this.donGia*this.thue*this.giamThue + this.donGia*this.giaVanChuyen)*120/100;
        
    }
    public static void creat(){
        bangThue.put("T", 0.29);
        bangThue.put("C", 0.1);
        bangThue.put("D", 0.08);
        bangThue.put("M", 0.02);
        
        bangGiaVanChuyen.put("T", 0.04);
        bangGiaVanChuyen.put("C", 0.03);
        bangGiaVanChuyen.put("D", 0.025);
        bangGiaVanChuyen.put("M", 0.005);
        
    }

    @Override
    public String toString() {
        return  maDon + " " + String.format("%.2f", this.giaBan);
    }
}
