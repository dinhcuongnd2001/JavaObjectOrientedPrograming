
package J05079.util;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Term> store = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            Term a = new Term(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            store.add(a);
        }
        Collections.sort(store);
        int m = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= m ; i++){
            String id = in.nextLine();
            System.out.println("Danh sach nhom lop mon " + Term.storeId.get(id) + ":");
            for(Term x : store){
                if(x.getId().equals(id))
                    System.out.println(x);
            }
        }
    }
}
