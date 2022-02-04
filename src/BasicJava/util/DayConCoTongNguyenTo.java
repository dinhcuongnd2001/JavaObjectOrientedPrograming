package BasicJava.util;

import java.util.*;
import java.math.*;
import java.io.*;

public class DayConCoTongNguyenTo {
    static int a[] = new int[20], x[] = new int[20], n ;
    static ArrayList<String> st = new ArrayList<>();
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static boolean check(){
        int sum = 0 ;
        for(int i = 1 ; i <= n ; i++){
            if(x[i] == 1){
                sum += a[i];
            }
        }
        return isPrime(sum);
    }
    
    public static void Try(int i){
        for(int j = 0; j <= 1 ; j++){
            x[i] = j;
            if(i == n){
                if(check()){
                    String ans = "";
                    for(int k = 1 ; k  <= n ; k++){
                        if(x[k]== 1){
                            ans += String.valueOf(a[k]) + " ";
                        }
                    }
                    st.add(ans);
                }
            }
            else{
                Try(i+1);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        int t = in.nextInt();
        while(t-- >0){
            st.clear();
            Arrays.fill(a, 0);
            Arrays.fill(x, 0);
            n = in.nextInt();
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 1 ; i <= n ; i++){
                ans.add(in.nextInt());
            }
            Collections.sort(ans, Collections.reverseOrder());
            int dem = 1;
            for(Integer x : ans){
                a[dem] = x ;
                dem += 1;
            }
            System.out.println();
            Try(1);
            Collections.sort(st);
            for(String x : st){
                System.out.println(x);
            }
        }
    }
}
