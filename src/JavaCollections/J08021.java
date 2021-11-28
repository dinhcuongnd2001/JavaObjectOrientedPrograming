package JavaCollections;

import java.util.*;
public class J08021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(n-- >0){
            String x = in.nextLine();
            Stack<Integer> st = new Stack<>();
            int  res = -1 ;
            st.push(-1);
            for(int i = 0 ;i < x.length(); i++){
               if(x.charAt(i) == '('){
                   st.push(i);
               }
               else{
                   st.pop();
                   if(st.size() > 0){
                       res = Math.max(res, i - st.peek());
                   }
                   else{
                       st.push(i);
                   }
               }
            }
            System.out.println(res);
        }
    }
}
