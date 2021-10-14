
package J05078.util;
import java.util.HashMap;

public class PhongBan {
    private String maP, tenP;
    public static HashMap<String, String> store = new HashMap<>();
    public PhongBan(String x) {
        String a[] = x.split(" " , 2);
        this.maP = a[0];
        this.tenP = a[1];
        store.put(this.maP, this.tenP);
    }

    public String getMaP() {
        return maP;
    }

    public String getTenP() {
        return tenP;
    }
}
