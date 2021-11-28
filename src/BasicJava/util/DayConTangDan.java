package BasicJava.util;
import java.io.*;
import java.util.*;

public class DayConTangDan {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(new File("DAYSO.in"));
        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<String> store = new ArrayList<>();
        int n = in.nextInt();
        int a[] = new int[n+1];
        for(int i = 0 ; i < n ; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i++){
            String s = String.valueOf(a[i]) + " ";
            for(int j = i+1 ; j < n ; j++){
                if(a[j] > a[i]){
                    s = s + a[j] + " ";
                    store.add(s);
                }
            }
        }
        Collections.sort(store);
        for(String x: store){
            System.out.println(x);
        }
    }
}
