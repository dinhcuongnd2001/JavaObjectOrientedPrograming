package XauKyTu;
import java.util.*;
import java.io.*;
public class J07008 {
    static int x[] = new int[25], a[] = new int[25], n = 0;
    static ArrayList<String> st = new ArrayList<>();
    
    public static void Try(int i){
        for(int j = 0 ;j <= 1 ; j++){
            x[i] = j ;
            if(i == n){
                if(check()){
                   handel(); 
                }
            }
            else Try(i+1);
        }
    }
    
    public static boolean check(){
        int mark[] = new int [22], index = 1;
        int count = 0;
        for(int i = 1 ; i <= n; i++){
            if(x[i] == 1){
                mark[index] = a[i]; 
                index += 1;
                count +=1 ;
            }
        }
        if(count ==1) return false;
        
        for(int i= 1; i < index -1 ; i++){
            if(mark[i] >= mark[i+1]){
                return false;
            }
        } 
        return true;
    }
    
    public static void handel(){
        String ans = "";
        boolean test = false;
        for(int i =1 ;i <= n ; i++){
            if(x[i] == 1){
                ans += String.valueOf(a[i]) + " ";
                test = true;
            } 
        }
        if(test) st.add(ans);
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DAYSO.in"));
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        n = in.nextInt();
        for(int i = 1 ; i <= n; i++){
            a[i] = in.nextInt();
        }
        Try(1);
        Collections.sort(st);
        for(String x : st){
            System.out.println(x);
        }
    }
}
