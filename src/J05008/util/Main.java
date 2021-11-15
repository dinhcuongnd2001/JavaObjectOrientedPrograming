
package J05008.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            Scanner in = new Scanner(System.in);
//          Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
            int t = in.nextInt();
            while(t-->0){
                int n =  in.nextInt();
                Point []a = new Point[n];
                for(int i = 0 ; i < n ; i++){
                    a[i] = new Point(in.nextDouble(), in.nextDouble());
                }
                Polygon x = new Polygon(a); 
                x.showResult();
            }
    }
}
