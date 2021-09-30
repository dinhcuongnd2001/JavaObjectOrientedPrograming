
package J05047.util;

import java.util.HashMap;

public class MatHang implements Comparable<MatHang>{
     private String ten, maHang;
    private long soLuong , donGia , tienChietKhau, thanhTien;
    private static HashMap<String , Integer > store = new HashMap<>();
    public MatHang(String ten, long soLuong, long donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        String a[] = this.ten.split(" ");
        String ma = a[0].substring(0 ,1).toUpperCase() +  a[1].substring(0 ,1).toUpperCase();
        store.put(ma, store.getOrDefault(ma, 0) + 1);
        this.maHang = ma + String.format("%02d", store.get(ma));
        if(this.soLuong > 10) this.tienChietKhau = this.soLuong * this.donGia * 5 /100 ;
        else if(this.soLuong >= 8) this.tienChietKhau = this.soLuong * this.donGia * 2 /100 ;
        else if(this.soLuong >= 5) this.tienChietKhau = this.soLuong * this.donGia * 1 /100 ;
        else this.tienChietKhau = 0 ;
        this.thanhTien = this.soLuong*this.donGia - this.tienChietKhau ;
    }
    
    @Override
    public String toString() {
        return maHang + " " + ten + " " +  " " + tienChietKhau + " " + thanhTien ;
    }

    @Override
    public int compareTo(MatHang o) {
       if(this.tienChietKhau < o.tienChietKhau) return 1;
       return -1;
    }
}
