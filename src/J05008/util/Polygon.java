package J05008.util;

public class Polygon {
    private Point[] p ;

    public Polygon(Point[] p) {
        this.p = p;
    }
    
    public void showResult(){
        double x = 0 ;
        for(int i = 0 ; i < this.p.length - 1 ; i++){
            x += (p[i].getX()*this.p[i+1].getY() - p[i].getY()*p[i+1].getX());
        }
        x += (p[p.length-1].getX()*p[0].getY() - p[0].getX()*p[p.length-1].getY());
        double ans = Math.round((Math.abs(x*1.0)) / 2 * 1000.0) / 1000.0;
        System.out.println(String.format("%.3f", ans));
    }
}
