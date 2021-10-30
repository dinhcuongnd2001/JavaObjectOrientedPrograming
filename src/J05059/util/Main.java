
package J05059.util;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<ListPassing> storeListPassings = new ArrayList<>();
        ListPassing.setStore();
        for(int i = 1 ; i <= n ; i++){
            ListPassing a = new ListPassing(in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            storeListPassings.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        Collections.sort(storeListPassings);
        ListPassing.standard = storeListPassings.get(m-1).getTotal();
        System.out.println(ListPassing.standard);
        for(ListPassing x : storeListPassings){
            x.setResult();
            System.out.println(x);
        }
    }
}
