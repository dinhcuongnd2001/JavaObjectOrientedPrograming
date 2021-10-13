
package J05013.util;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Recruitment> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Recruitment a = new Recruitment(i, in.nextLine() , Double.parseDouble(in.nextLine()) , Double.parseDouble(in.nextLine()));
            ans.add(a);
        }
        Collections.sort(ans);
        for(Recruitment x : ans){
            System.out.println(x);
        }
    }
}
