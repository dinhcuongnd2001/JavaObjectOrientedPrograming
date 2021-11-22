package J04015.util;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String id, name, position;
        long basicSalary, total,bonus, radix;
        id =in.nextLine();
        name = in.nextLine();
        basicSalary = Integer.parseInt(in.nextLine());
        position = id.substring(0,2);
        if(position.equals("HT")) bonus = 2000000;
        else if(position.equals("HP")) bonus = 900000;
        else bonus = 500000;
        radix = Integer.parseInt(id.substring(2,4));
        total = bonus + basicSalary*radix;
        System.out.println(id + " " +name + " " + radix + " " + bonus + " " + total);
    }
}
