package BasicJava.util;

import java.util.*;

public class HinhVuong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> pointX = new ArrayList<>();
        ArrayList<Integer> pointY = new ArrayList<>();
        int minx1 = in.nextInt(), miny1 = in.nextInt(), maxx1 = in.nextInt(), maxy1 = in.nextInt();
        int minx2 = in.nextInt(), miny2 = in.nextInt(), maxx2 = in.nextInt(), maxy2 = in.nextInt();
        pointX.add(minx1);pointX.add(minx2);pointX.add(maxx1);pointX.add(maxx2);
        pointY.add(miny1);pointY.add(miny2);pointY.add(maxy1);pointY.add(maxy2);
        Collections.sort(pointX);
        Collections.sort(pointY);
        int x = pointX.get(pointX.size()-1) - pointX.get(0);
        int y = pointY.get(pointY.size()-1) - pointY.get(0);
        int a = Math.max(x, y);
        System.out.println(a*a);
    }
}
