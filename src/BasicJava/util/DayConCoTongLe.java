package BasicJava.util;
import java.io.*;
import java.util.*;

public class DayConCoTongLe {
    static int x[] = new int[100], a[] = new int[100], n = 0 ;
    static ArrayList<String> st = new ArrayList<>();
    public static void Try(int i){
        for(int j = 0 ; j <=1 ; j++){
            x[i] = j;
            if(i == n){
                handle();
            }
            else Try(i+1);
        }
    }
    
    public static void handle(){
        int sum= 0 ;
        String ans = "";
        for(int i =1; i <= n ; i++){
            if(x[i] == 1){
                sum += a[i];
                ans += String.valueOf(a[i]) + " ";
            }
        }
        if(sum % 2 == 1){
            ans = ans.substring(0, ans.length()-1);
            st.add(ans);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int t = in.nextInt();
        while(t--  > 0){
            st.clear();
            n = in.nextInt();
            int b[] = new int [n+1];
            for(int i = 1 ;i <= n ; i++){
                b[i] = in.nextInt();
                
            }
            Arrays.sort(b,1,n);
            int index = n;
            for(int i = 1 ; i <= n ; i++){
                a[i] = b[index];
                index -= 1;
            }
            Try(1);
            Collections.sort(st);
            for(String s : st){
                System.out.println(s);
            }
        }
    }
}
