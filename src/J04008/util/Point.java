
package J04008.util;

public class Point {
    private double x , y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static double distance(Point a , Point b){
        double x = a.x - b.x ;
        double y = a.y - b.y ;
        return Math.sqrt(x*x + y*y) ; 
    }
}
