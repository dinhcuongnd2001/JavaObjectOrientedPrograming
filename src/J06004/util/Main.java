
package J06004.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Members> list = new ArrayList<>();
        int n = in.nextInt() , m = in.nextInt();
        in.nextLine();
        for(int i = 0 ; i < n ; i++){
            Members a = new Members(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(a);
        }
        while(m-- > 0){
            Members.addTopic(in.nextLine());
        }
        Collections.sort(list);
        for(Members x : list){
            System.out.println(x + " " + Members.topic[Integer.parseInt(x.getIdGroup())]);
        }
    }
}
