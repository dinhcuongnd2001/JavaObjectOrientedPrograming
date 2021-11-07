package J07002.util;

import java.util.*;
import java.io.*;

public class Main {
    
//    public static boolean check(String x){
//        for(int i = 0 ; i < x.length(); i++){
//            if(Character.isLetter(x.charAt(i))){
//                return false;
//            }
//        }
//        return true;
//    }
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        Scanner in = new Scanner(new File("DATA.in"));
        long sum = 0 ;
        while(in.hasNext()){
//            String x = in.next();
//            if(x.length() < 10 && check(x)){
//               long val = Long.parseLong(x);
//               if(val <= Integer.MAX_VALUE){
//                   sum += val;
//               }
//            }
            try {
                sum += Integer.parseInt(in.next());
            } catch (Exception e) {
                
            }
        }
        System.out.println(sum);
    }
}
