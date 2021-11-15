package J05062.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
         Scanner in = new Scanner(System.in);
//       Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Infomation> ans = new ArrayList<>();
        int n = in.nextInt(), m = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n ; i++){
            Infomation a = new Infomation(in.nextLine(), in.nextLine());
            ans.add(a);
        }
        Infomation.getMark(m);
        for(Infomation x : ans){
            x.getStatus();
            System.out.println(x);
        }
   }
}
