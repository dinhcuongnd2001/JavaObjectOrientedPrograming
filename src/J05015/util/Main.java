
package J05015.util;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Cua_ro> listCua_ro = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i= 1 ; i <= n ; i++){
            Cua_ro a = new Cua_ro(in.nextLine(), in.nextLine(), in.nextLine());
            listCua_ro.add(a);
        }
        Collections.sort(listCua_ro);
        for(Cua_ro x : listCua_ro){
            System.out.println(x);
        }
    }
}
