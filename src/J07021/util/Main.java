
package J07021.util;

import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        while(true){
            String x = in.nextLine();
            if(x.equals("END")){
                break;
            }
            else{
                String s[] = x.trim().toLowerCase().split("\\s+");
                String ans = "";
                for(int i = 0 ; i < s.length ; i++){
                    ans = ans + s[i].substring(0,1).toUpperCase() + s[i].substring(1).toLowerCase() + " ";
                }
                System.out.println(ans);
            }
        }
    }
}
