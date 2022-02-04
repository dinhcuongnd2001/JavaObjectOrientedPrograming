package BasicJava.util;
import java.util.*;
import java.text.*;
public class KhaiXuanNamMoi {
    public static SimpleDateFormat formater = new SimpleDateFormat("HH:mm:ss - dd/MM/YYYY");
    public static void main(String[] args) {
        Date t1 = new Date();
        System.out.println("Xin Chao Nam Moi 2022, hien tai la: " + formater.format(t1));
    }
}
