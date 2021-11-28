
package JavaCollections;
import java.io.*;
import java.util.*;
public class J08020 {
    public static boolean check(char x){
        if(x =='}' || x == ']' || x == ')') return true;
        return false;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int n = Integer.parseInt(in.nextLine());
        while(n-- > 0){
            Stack<String> st = new Stack<>();
            String s = in.nextLine();
            if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')'){
                System.out.println("NO");
            }
            else{
                Boolean test = true;
                st.push(String.valueOf(s.charAt(0)));                
                for(int i = 1 ; i < s.length(); i++){
                    if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                        st.push(String.valueOf(s.charAt(i)));
                    }
                    else if(s.charAt(i) == '}'){
                        if(st.size() == 0){
                            test = false;
                            break;
                        }
                        else if(st.peek().equals("{")) st.pop();
                    }
                    else if(s.charAt(i) == ')'){
                        if(st.size() == 0){
                            test = false;
                            break;
                        }
                        else if(st.peek().equals("(")) st.pop();
                    }
                    else if(s.charAt(i) == ']'){
                        if(st.size() == 0){
                            test = false;
                            break;
                        }
                        else if(st.peek().equals("[")) st.pop();
                    }
                    
                }
                if(st.size() > 0) test = false;
                if(!test) System.out.println("NO");
                else System.out.println("YES");
            }

        }
    }
}
