
package J05060.util;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ResultsTest> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            ResultsTest a = new ResultsTest(i, in.nextLine(),in.nextLine(),Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()));
            store.add(a);
        }
        for(ResultsTest x : store){
            System.out.println(x);
        }
    }
}
