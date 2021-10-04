
package J05050.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Client> ans = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Client a = new Client(i , in.nextLine() , Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
            ans.add(a);
        }
        for(Client x : ans){
            System.out.println(x);
        }
    }
}
