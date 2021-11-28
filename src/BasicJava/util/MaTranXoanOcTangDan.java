package BasicJava.util;
import java.util.*;
import java.io.*;
public class MaTranXoanOcTangDan {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
         //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Integer> st = new ArrayList<>();
        int n = in.nextInt();
        int a[][] = new int[n+3][n+3], res[][] = new int[n+3][n+3];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                a[i][j] = in.nextInt();
                st.add(a[i][j]);
            }
        }
        Collections.sort(st);
        int d = 0, b = 0 ;
        while(b <= n/2){
            for(int i = b ; i < n-b; i++){
                res[b][i] = st.get(d);
                d++;
            }
            for(int i = b + 1; i < n-b; i++){
                res[i][n-b-1] = st.get(d);
                d++;
            }
            for(int i = n-b-2; i >= b; i--){
                res[n-b-1][i] = st.get(d);
                d++;
            }
            for(int i = n-b-2; i > b ; i--){
                res[i][b] = st.get(d);
                d++;
            }
            b++;
        }
        for(int i = 0 ;i < n ; i++){
            for(int j =0 ; j < n; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
