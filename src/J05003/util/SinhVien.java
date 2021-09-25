
package J05003.util;

public class SinhVien {
    private String ma , ten , lop , ngaySinh ;
    private float diemGPA ;

    public SinhVien(int i , String ten, String lop, String ngaySinh, float diemGPA) {
        this.ma = "B20DCCN" + String.format("%03d", i);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.diemGPA = diemGPA;
    }
    
    public void chuanHoa(){
        String []a = this.ngaySinh.split("/");
        String ans = "";
        for(int i = 0 ; i < a.length -1 ; i++){
            if(a[i].length() == 1){
                a[i]= "0" + a[i];
            }
            ans = ans + a[i] + "/";
        }
        ans = ans + a[a.length-1];
        this.ngaySinh = ans;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", diemGPA);
    }
    
}
