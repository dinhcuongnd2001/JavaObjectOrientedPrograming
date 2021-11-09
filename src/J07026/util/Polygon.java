package J07026.util;

public class Polygon {
    private Point[] p ;

    public Polygon(Point[] p) {
        this.p = p;
    }
    public String getArea(){
        long Area = 0 ;
        for(int i = 0 ; i < p.length - 1 ; i++){
            Area =  Area + (p[i].getX()*p[i+1].getY() - p[i+1].getX()*p[i].getY());
        }
        double res = Math.round((Math.abs(Area)*1.0 / 2) * 1000.0) / 1000.0;
        return String.format("%.3f", res);
    }
}
