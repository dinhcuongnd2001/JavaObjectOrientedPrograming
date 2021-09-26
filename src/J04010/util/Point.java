
package J04010.util;

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
    
    public static double area(Point a, Point b , Point c){
            double c1, c2 ,c3, S ;
            c1 = Point.distance(a, b);
            c2 = Point.distance(b, c);
            c3 = Point.distance(a, c);
            if(c1 >= c2 + c3 || c1 <= Math.abs( c3- c2)){
                return -1;
            }
            S = Math.sqrt((c1 + c2 + c3) *  (c1 + c2 - c3) * (c1 - c2 + c3) * (-c1 + c2 + c3)) / 4;
            return S ;
    }
    
    public static double circleArea(Point a , Point b , Point c){
        double area , ans , c1 ,c2 ,c3 ;
        c1 = Point.distance(a, b);
        c2 = Point.distance(b, c);
        c3 = Point.distance(a, c);
        area = Point.area(a, b, c);
        if(area == -1) return -1;
        ans = (c1*c2*c3)/(4*area);
        return Math.PI * ans * ans;
    }
}
