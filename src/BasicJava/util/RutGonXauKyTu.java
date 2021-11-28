package BasicJava.util;

import java.util.*;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Stack<String> res = new Stack<>();
        String x = in.nextLine();
        res.add(String.valueOf(x.charAt(0)));
        for(int i = 1 ; i < x.length();i++){
            if(res.size() > 0 && String.valueOf(x.charAt(i)).equals(res.peek())){
                res.pop();
            }
            else res.push(String.valueOf(x.charAt(i)));
        }
        if(res.size()==0){
            System.out.println("Empty String");
        }
        else{
            String s = "";
            while(res.size() >0){
                s += res.peek();
                res.pop();
            }
            StringBuilder ans = new StringBuilder(s);
            System.out.println(ans.reverse().toString());
        }

    }
}
