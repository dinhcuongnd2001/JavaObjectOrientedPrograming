package TN02012.util;

public class PhongBan {
    private String maPhong, tenPhong;

    public PhongBan(String s) {
        String x[] = s.split(" ", 2);
        this.maPhong = x[0];
        this.tenPhong = x[1];
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }
    
}
