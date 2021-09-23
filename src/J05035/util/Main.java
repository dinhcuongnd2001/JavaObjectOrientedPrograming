package J05035.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Internship> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Internship a = new Internship(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ans.add(a);
        }
        Collections.sort(ans);
        int Q = Integer.parseInt(in.nextLine());
        while (Q-- > 0) {
            String NInterprise = in.nextLine();
            for (Internship x : ans) {
                if (x.getEnterprise().equals(NInterprise)) {
                    System.out.println(x);
                }
            }
        }
    }
}
