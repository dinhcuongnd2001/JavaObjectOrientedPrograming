package J05066.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Employee>store = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n; i++){
            Employee a = new Employee(in.nextLine());
            store.add(a);
        }
        Collections.sort(store);
        int Q = Integer.parseInt(in.nextLine());
        while(Q-- > 0){
            String s = in.nextLine().toLowerCase();
            for(Employee x : store){
                if(x.getName().toLowerCase().contains(s)){
                    System.out.println(x);
                }
            }
            System.out.println("");
        }
    }
}
