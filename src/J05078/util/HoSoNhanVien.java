
package J05078.util;

public class HoSoNhanVien {
    private String maNV, tenN , PhongBan , maBan;
    private long luongCB, soNC, tongLuong , heSo;

    public HoSoNhanVien(String maNV, String tenN, long luongCB, long soNC) {
        this.maNV = maNV;
        this.tenN = tenN;
        this.luongCB = luongCB;
        this.soNC = soNC;
        String loaiNV = this.maNV.substring(0,1);
        int namLamviec = Integer.parseInt(this.maNV.substring(1,3));
        
        if(loaiNV.equals("A")){
            if(namLamviec <= 3) this.heSo = 10 ;
            else if(namLamviec <=8) this.heSo= 12;
            else if(namLamviec <= 15) this.heSo = 14;
            else this.heSo = 20;
        }
        else if(loaiNV.endsWith("B")){
            if(namLamviec <= 3) this.heSo = 10 ;
            else if(namLamviec <=8) this.heSo= 11;
            else if(namLamviec <= 15) this.heSo = 13;
            else this.heSo = 16;
        }
        else if(loaiNV.endsWith("C")){
            if(namLamviec <= 3) this.heSo = 9 ;
            else if(namLamviec <=8) this.heSo= 10;
            else if(namLamviec <= 15) this.heSo = 12;
            else this.heSo = 14;
        }
        else{
            if(namLamviec <= 3) this.heSo = 8 ;
            else if(namLamviec <=8) this.heSo= 9;
            else if(namLamviec <= 15) this.heSo = 11;
            else this.heSo = 13;
        }
        
        this.maBan = this.maNV.substring(3,5);
        this.tongLuong = this.luongCB * this.soNC * this.heSo * 1000;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public String getMaBan() {
        return maBan;
    }

    @Override
    public String toString() {
        return maNV + " " + tenN + " " + tongLuong ;
    }
}
