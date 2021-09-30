
package J05032.util;

public class ThongTin implements Comparable<ThongTin>{
    String ten, ngaySinh;

    public ThongTin(String s) {
        String []a = s.split(" ");
        this.ten = a[0];
        String []b = a[1].split("/");
        this.ngaySinh = b[2] + b[1] + b[0];
    }

    @Override
    public String toString() {
        return  ten;
    }

    @Override
    public int compareTo(ThongTin o) {
        return this.ngaySinh.compareTo(o.ngaySinh);
    }
}
