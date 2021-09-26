
package J04008.util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            Point a = new Point(in.nextDouble(), in.nextDouble());
            Point b = new Point(in.nextDouble(), in.nextDouble());
            Point c = new Point(in.nextDouble(), in.nextDouble());
            double c1, c2 ,c3;
            c1 = Point.distance(a, b);
            c2 = Point.distance(b, c);
            c3 = Point.distance(a, c);
            if(c1 >= c2 + c3 || c1 <= Math.abs( c3- c2)){
                System.out.println("INVALID");
            }
            else{
                System.out.printf("%.3f\n" , (c1+c2+c3));
            }
        }
    }
}
