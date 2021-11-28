package J07049.util;

import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        Scanner in = new Scanner(new File("MUAHANG.in"));
        ArrayList<Products> stProductses = new ArrayList<>();
        ArrayList<Clients> stClientses = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i <n ; i++){
            Products a = new Products(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
            stProductses.add(a);
        }
        n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n ; i++){
            Clients a = new Clients(i, in.nextLine(), in.nextLine(),in.nextLine(), Integer.parseInt(in.nextLine()), in.nextLine());
            stClientses.add(a);
        }
        
        for(Clients x : stClientses){
            for(Products y : stProductses){
                if(x.getIdProduct().equals(y.getIdProduct())){
                    x.setX(y);
                    break;
                }
            }
        }
        Collections.sort(stClientses);
        for(Clients x : stClientses){
            System.out.println(x);
        }
    }
}
