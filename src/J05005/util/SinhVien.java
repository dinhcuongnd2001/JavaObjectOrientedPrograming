
package J05005.util;

public class SinhVien implements Comparable<SinhVien>{
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
        this.ten = this.ten.trim();
        this.ten = this.ten.toLowerCase();
        String b [] = this.ten.split("\\s+");
        String res = "" ;
        for(int i = 0 ; i < b.length ; i++){
            res = res +  b[i].substring(0 , 1).toUpperCase() + b[i].substring(1) + " " ;
        }
        
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
        this.ten = res;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", diemGPA);
    }

    @Override
    public int compareTo(SinhVien o) {
       if(this.diemGPA < o.diemGPA) return 1;
       return -1;
    }
}
