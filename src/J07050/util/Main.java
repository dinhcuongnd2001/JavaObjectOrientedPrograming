package J07050.util;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("MATHANG.in"));
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Products> ans = new ArrayList<>();
        for(int i = 1;  i <= n ; i++){
            Products a = new Products(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()),Double.parseDouble(in.nextLine()));
            ans.add(a);
        }
        Collections.sort(ans);
        for(Products x : ans){
            System.out.println(x);
        }
    }
}
