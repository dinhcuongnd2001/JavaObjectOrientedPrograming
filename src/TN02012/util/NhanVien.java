package TN02012.util;

public class NhanVien {
    private String maNV, tenNV, phongBan, nhomNV,maPhongBan;
    private long luongCB, soNgayCong, heSoNhan, soNamCongTac,luong;
    private PhongBan P;
    public NhanVien(String maNV, String tenNV, long luongCB, long soNgayCong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.soNgayCong = soNgayCong;
        this.nhomNV = this.maNV.substring(0,1);
        this.soNamCongTac = Long.parseLong(this.maNV.substring(1,3));
        this.maPhongBan = this.maNV.substring(3);
        if(this.nhomNV.equals("A")){
            if(this.soNamCongTac <= 3) this.heSoNhan =10;
            else if(this.soNamCongTac <= 8) this.heSoNhan = 12;
            else if(this.soNamCongTac <= 15) this.heSoNhan = 14;
            else this.heSoNhan = 20; 
        }
        else if(this.nhomNV.equals("B")){
            if(this.soNamCongTac <= 3) this.heSoNhan =10;
            else if(this.soNamCongTac <= 8) this.heSoNhan = 11;
            else if(this.soNamCongTac <= 15) this.heSoNhan = 13;
            else this.heSoNhan = 16; 
        }
        else if(this.nhomNV.equals("C")){
            if(this.soNamCongTac <= 3) this.heSoNhan =9;
            else if(this.soNamCongTac <= 8) this.heSoNhan = 10;
            else if(this.soNamCongTac <= 15) this.heSoNhan = 12;
            else this.heSoNhan = 14; 
        }
        else{
            if(this.soNamCongTac <= 3) this.heSoNhan =8;
            else if(this.soNamCongTac <= 8) this.heSoNhan = 9;
            else if(this.soNamCongTac <= 15) this.heSoNhan = 11;
            else this.heSoNhan = 13; 
        }
        this.luong = this.luongCB*this.soNgayCong*this.heSoNhan*1000;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }
    
    public void setP(PhongBan P) {
        this.P = P;
    }

    @Override
    public String toString() {
        return maNV + " " + tenNV +" " +P.getTenPhong()+ " " + luong;
    }
    
}
