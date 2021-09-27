
package J05026.util;

public class GiangVien {
     private String ma , hoTen , boMon ;

    public GiangVien(int i , String hoTen, String boMon) {
        this.ma = "GV" + String.format("%02d", i);
        this.hoTen = hoTen;
        String ans = "";
        String []a = boMon.split(" ");
        for(int k = 0 ; k < a.length ; k++){
            ans += a[k].substring(0,1).toUpperCase();
        }
        this.boMon = ans;
    }

    public String getBoMon() {
        return boMon;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + boMon;
    }
}
