
package J05007.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Personnel> Store = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            Personnel a = new Personnel(i , in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            Store.add(a);
            //System.out.println(a.Scompare());
        }
        Collections.sort(Store);
        for(Personnel x : Store){
            System.out.println(x);
        }
    }
}
