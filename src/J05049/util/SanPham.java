
package J05049.util;

public class SanPham implements Comparable<SanPham>{
    private String ma;
    private long soLuongNhap, soLuongXuat, donGia, tien, thue;

    public SanPham(String ma, long soLuongNhap) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        String a = this.ma.substring(0 , 1);
        if(a.equals("A")){
            this.soLuongXuat = (Math.round((double)this.soLuongNhap * 60 / 100) ) ;
        }
        else this.soLuongXuat = (Math.round((double)this.soLuongNhap * 70 / 100));
        String b = this.ma.substring(this.ma.length()-1 , this.ma.length());
        if(b.equals("Y")) this.donGia = 110000 ;
        else this.donGia = 135000;
        this.tien = this.soLuongXuat * this.donGia ;
        if(a.equals("A") && b.equals("Y")) this.thue = this.tien * 8 /100;
        else if(a.equals("A") && b.equals("N")) this.thue = this.tien * 11/100;
        else if(a.equals("B") && b.equals("Y")) this.thue = this.tien * 17/100;
        else this.thue = this.tien * 22 /100;
    }
    
    public String getNhom(){
        return this.ma.substring(0,1);
    }

    @Override
    public String toString() {
        return  ma + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien + " " + thue;
    }

    @Override
    public int compareTo(SanPham o) {
        if (this.thue < o.thue) return 1;
        return -1;
    }
}
