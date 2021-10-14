
package J02077.util;

public class PhongBan {
    private String maP, tenP;

    public PhongBan(String x) {
        String a[] = x.split(" " , 2);
        this.maP = a[0];
        this.tenP = a[1];
    }

    public String getMaP() {
        return maP;
    }

    public String getTenP() {
        return tenP;
    }
}
