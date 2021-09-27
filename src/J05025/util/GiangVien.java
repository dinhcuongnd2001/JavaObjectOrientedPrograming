
package J05025.util;

public class GiangVien implements Comparable<GiangVien>{
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

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + boMon;
    }
    
    public String ten(){
        String []a = this.hoTen.split(" ");
        return a[a.length -1];
    }

    @Override
    public int compareTo(GiangVien o) {
        if(this.ten().compareTo(o.ten()) > 0) return 1 ;
        else if(this.ten().compareTo(o.ten()) == 0){
            return this.ma.compareTo(o.ma) ;
        }
        return -1;
    }
    
    
    
}
