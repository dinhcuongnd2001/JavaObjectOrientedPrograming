package J04013.util;


public class ThongTinDiem {
    private String ma , ten , TrangThai ;
    private double diemUutien , diemTong ;

    public ThongTinDiem(String ma, String ten, double diemTong) {
        this.ma = ma;
        this.ten = ten;
        this.diemTong = diemTong;
        
        String a = this.ma.substring(0 , 3);
        if(a.equals("KV1")) this.diemUutien = 0.5;
        if(a.equals("KV2")) this.diemUutien = 1.0;
        if(a.equals("KV3")) this.diemUutien = 2.5;
        
        if(this.diemTong + this.diemUutien >= 24) this.TrangThai = "TRUNG TUYEN";
        else this.TrangThai = "TRUOT";
    }

    @Override
    public String toString() {
        String diemUT = String.format("%.1f", diemUutien);
        String diemT = String.format("%.1f", diemTong);
        if(diemUT.length() == 3 && diemUT.charAt(2) == '0') diemUT = diemUT.substring(0 , 1) ;
        if(diemT.charAt(diemT.length() - 1) == '0') diemT = diemT.substring(0 , diemT.length() - 2);
        return  ma + " " + ten + " "  + " " + diemUT + " " + diemT + " " + TrangThai;
    }
    
}
