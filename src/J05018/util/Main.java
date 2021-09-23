
package J05018.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Transcript> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            String s = in.nextLine();
            double average = 0 ;
            for(int j = 0 ; j < 10 ; j++){
                double val1 = Double.parseDouble(in.next());
                if(j <= 1){
                    average += (val1 * 2) ;
                }
                else average += val1;
            }
            in.nextLine();
            average /= 12 ;
            Transcript a = new Transcript(i , s ,average);
            a.setDegree();
            ans.add(a);
       }
        Collections.sort(ans);
        for(Transcript x1 : ans){
            System.out.println(x1);
        }
    }
}
