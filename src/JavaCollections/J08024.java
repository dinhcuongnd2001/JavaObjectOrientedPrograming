package JavaCollections;

import java.util.*;
public class J08024 {
    
    public static boolean check(String x, int n){
        long ans = 0 ;
        for(int i = 0; i < x.length(); i++){
            ans = ans * 10 + (x.charAt(i) - '0');
        }
        if(ans == 0) return false;
        return (ans*9 % n == 0);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- >0){
            int x = in.nextInt();
           ArrayDeque<String>  st = new ArrayDeque<>();
           st.push("0");
           st.push("1");
           //System.out.println(st.getLast());
           //st.removeLast();
           //System.out.println(st.getLast());
            while(!check(st.getLast(),x)){
                String x1 = st.getLast()  +"0";
                String x2 = st.getLast() + "1";
                st.removeLast();
                st.push(x1);
                st.push(x2);
            }
            
            long ans = 0 ;
            String s = st.getLast();
            for(int i = 0; i < s.length(); i++){
                ans = ans * 10 + (s.charAt(i) - '0');
            }
            System.out.println(ans*9);
        }
    }
}
