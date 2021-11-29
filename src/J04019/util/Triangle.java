
package J04019.util;
public class Triangle {
    private Point a,b,c;
    private double c1,c2,c3;
    
    public Triangle(Point a , Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        c1 = Math.sqrt((this.a.getX() - this.b.getX())*(this.a.getX() - this.b.getX()) + (this.a.getY() - this.b.getY()) *(this.a.getY() - this.b.getY()));
        c2 = Math.sqrt((this.a.getX() - this.c.getX())*(this.a.getX() - this.c.getX()) + (this.a.getY() - this.c.getY()) *(this.a.getY() - this.c.getY()));
        c3 = Math.sqrt((this.b.getX() - this.c.getX())*(this.b.getX() - this.c.getX()) + (this.c.getY() - this.b.getY()) *(this.c.getY() - this.b.getY()));
    }
    public boolean valid(){
        if(c1+c2<c3 || c1+c3< c2 || c2+c3<c1) return false;
        return true;
    }
    public String getPerimeter(){
        return String.format("%.3f",(c1+c2+c3));
    }
}
