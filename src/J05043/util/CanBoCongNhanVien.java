
package J05043.util;

public class CanBoCongNhanVien {
    private String ma, hoTen, chuVu;
    long luongCB, soNgayCong, phuCapChuVu , luongChinh, tamUng, conLai;

    public CanBoCongNhanVien(int i ,String hoTen, String chuVu, long luongCB, long soNgayCong) {
        this.ma = "NV" + String.format("%02d", i);
        this.hoTen = hoTen;
        this.chuVu = chuVu;
        this.luongCB = luongCB;
        this.soNgayCong = soNgayCong;
        this.luongChinh = this.luongCB * this.soNgayCong;
        
        if(this.chuVu.equals("GD")) this.phuCapChuVu = 500;
        else if(this.chuVu.equals("PGD")) this.phuCapChuVu = 400;
        else if(this.chuVu.equals("TP")) this.phuCapChuVu = 300;
        else if(this.chuVu.equals("KT")) this.phuCapChuVu = 250;
        else this.phuCapChuVu = 100;
        
        double a = (this.phuCapChuVu + this.luongChinh) * 2 / 3;
        
        if(a < 25000){
          this.tamUng = (Math.round(a /1000)) * 1000;
        }
        else this.tamUng = 25000;
        this.conLai = this.luongChinh + this.phuCapChuVu - this.tamUng;
    }

    @Override
    public String toString() {
        return  ma + " " + hoTen + " " + phuCapChuVu + " " + luongChinh + " " + tamUng + " " + conLai;
    }
}
