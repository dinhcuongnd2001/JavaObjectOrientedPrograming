package J04013.util;


public class ThongTinDiem {
    private String ma , ten , TrangThai ;
    private double diemUutien , diemTong ;

    public ThongTinDiem(String ma, String ten, double diemTong) {
        this.ma = ma;
        this.ten = ten;
        this.diemTong = diemTong;
    }

    public void setDiemUutien() {
        String a = this.ma.substring(0 , 2);
        if(a.equals("KV1")) this.diemUutien = 0.5;
        if(a.equals("KV2")) this.diemUutien = 1.0;
        if(a.equals("KV3")) this.diemUutien = 2.5;
    }

    public void setTrangThai() {
        if(this.diemTong + this.diemUutien >= 24) this.TrangThai = "TRUNG TUYEN";
        else this.TrangThai = "TRUOT";
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " "  + " " + String.format("%.01", args)diemUutien + " " + diemTong + TrangThai  ;
    }
    
}
