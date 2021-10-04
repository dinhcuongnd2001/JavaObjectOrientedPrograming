
package J05052.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<InformationOfOrder> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n ; i++){
            InformationOfOrder a = new InformationOfOrder(in.nextLine(), in.nextLine(),Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            ans.add(a);
        }
        for(InformationOfOrder x : ans){
            System.out.println(x);
        }
    }
}
