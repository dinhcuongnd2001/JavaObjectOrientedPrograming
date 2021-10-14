
package J05075.uitl;

public class ThongTinSinhVien {
    private String ma, ten , lop , status;
    private int diem;

    public ThongTinSinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.status = "";
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
    
    public void setDiem(String x) {
        this.diem = 10;
        int demMuon = 0 , demVang = 0;
        for(int i = 0 ; i <x.length() ; i++){
            if(x.charAt(i) == 'm'){
                demMuon += 1;
            }
            if(x.charAt(i) == 'v'){
                demVang += 1;
            }
        }
        this.diem = 10 - demMuon - demVang * 2;
        if(this.diem < 0) this.diem = 0 ;
    }

    @Override
    public String toString() {
        if(this.diem == 0) return ma + " " + ten + " " + lop + " " + diem + " " + "KDDK";
        return  ma + " " + ten + " " + lop + " " + diem + " " ;
    }
}
