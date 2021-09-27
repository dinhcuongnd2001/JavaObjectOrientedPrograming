
package BasicJava.util;

import java.util.HashMap;
import java.util.Scanner;


public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        HashMap<String , Integer > store = new HashMap<String , Integer>() ;
        while(test-- >0){
            String s = in.nextLine();
            s = s.trim();
            s = s.toLowerCase();
            String [] ans = s.split(" ") ;
            String res = ans[ans.length -1] ;
            for(int i = 0 ; i < ans.length - 1 ; i++){
                if(ans[i].compareTo(" ") > 0){
                    res += ans[i].substring(0 , 1);
                }
            }
            if(store.get(res) == null){
                System.out.println(res + "@ptit.edu.vn");
                store.put(res , store.getOrDefault(res , 0) +1) ;
            }
            else{
                int num = store.get(res) + 1;
                System.out.println(res + num + "@ptit.edu.vn");
                store.put(res, store.getOrDefault(res , 0) + 1);
            }
        }
    }
}
