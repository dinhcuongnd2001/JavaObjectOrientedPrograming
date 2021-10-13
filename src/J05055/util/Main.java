
package J05055.util;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Athlete> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            Athlete x = new Athlete(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            list.add(x);
        }
        for(Athlete x : list){
            x.setRank();
            System.out.println(x);
        }
    }
}
