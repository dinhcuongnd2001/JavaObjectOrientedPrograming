package J04019.util;

import java.util.*;

public class Point {
    private static Scanner in;
    private static double val1 , val2;
    public static void nextPoint(Scanner sc){
        in = sc ;
        val1 = in.nextDouble();
        val2 = in.nextDouble();
    }
    private double x= val1, y = val2 ;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    
}
