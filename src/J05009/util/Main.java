
package J05009.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<InfoScores> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            InfoScores a = new InfoScores(i ,in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            ans.add(a);
        }
        for(InfoScores x : ans){
            if(x.getTotalScores() == InfoScores.maxScores) System.out.println(x);
        }
    }
}