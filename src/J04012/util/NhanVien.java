
package J04012.util;

public class NhanVien {
    private String ma , ten , chucVu;
    private long luongCB , soNgayCong , thuong , phuCap , thuNhap ; 

    public NhanVien(int i , String ten, long luongCB, long soNgayCong, String chucVu) {
        this.ma = "NV" + String.format("%02d", i);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.soNgayCong = soNgayCong;
        this.luongCB = this.luongCB * this.soNgayCong;
        
        if(this.soNgayCong >= 25){
            this.thuong = this.luongCB * 20 / 100; 
        }
        else if(this.soNgayCong >=22) 
            this.thuong = this.luongCB * 10 / 100 ;
        else this.thuong = 0 ;
        
        if(this.chucVu.equals("GD")) this.phuCap = 250000 ;
        else if (this.chucVu.equals("PGD")) this.phuCap = 200000;
        else if(this.chucVu.equals("TP")) this.phuCap = 180000;
        else this.phuCap = 150000;
        
        this.thuNhap = this.luongCB + this.thuong + this.phuCap;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + luongCB + " " + thuong + " " + phuCap + " " + thuNhap ;
    }
    
}
