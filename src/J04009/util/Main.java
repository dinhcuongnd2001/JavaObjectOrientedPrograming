
package J04009.util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-- >0){
            Point a = new Point(in.nextDouble(), in.nextDouble());
            Point b = new Point(in.nextDouble(), in.nextDouble());
            Point c = new Point(in.nextDouble(), in.nextDouble());
            double S = Point.area(a, b, c);
            if(S == -1){
                System.out.println("INVALID");
            }
            else
                System.out.printf("%.2f\n" , S);
        }
    }    
}
