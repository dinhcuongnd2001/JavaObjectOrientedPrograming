
package J06003.util;

import java.util.ArrayList;
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
        int Q = Integer.parseInt(in.nextLine());
        while(Q-- > 0){
            String group = in.nextLine();
            System.out.println("DANH SACH NHOM " + group + ":");
            for(Members x : list){
                if(x.getIdGroup().equals(group)) System.out.println(x);
            }
            System.out.println("Bai tap dang ky: " + Members.topic[Integer.parseInt(group)]);
        }
    }
}
