
package J05040.util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Salary> store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i =1 ; i <= n; i++){
            Salary a = new Salary(i , in.nextLine(), Long.parseLong(in.nextLine()),Long.parseLong(in.nextLine()), in.nextLine());
            store.add(a);
        }
        for(Salary x : store){
            System.out.println(x);
        }
    }
}
