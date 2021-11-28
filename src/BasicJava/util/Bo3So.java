
package BasicJava.util;
import java.util.*;
import java.io.*;
public class Bo3So {
    
    public static boolean binary_search(long a[], int l , int r, long val){
        while(l <= r){
            int m = (l+r)/2;
            if(val == a[m]*a[m]) return true;
            if(val > a[m]*a[m]) l = m + 1;
            if(val < a[m]*a[m]) r = m -1 ; 
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            long a[] = new long[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = in.nextLong();
            }
            Arrays.sort(a);
            boolean check = true;
            for(int i = 0; i < n - 1 ; i++){
                for(int j = i+1 ; j < n ; j++){
                    long val = a[i]*a[i] + a[j]*a[j];
                    if(binary_search(a, j+1, n-1, val)){
                        check = false;
                        break;
                    }
                }
                if(!check) break;
            }
            if(check){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
