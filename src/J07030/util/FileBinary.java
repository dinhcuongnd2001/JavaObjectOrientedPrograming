package J07030.util;

import java.util.*;
import java.io.*;
public class FileBinary {
    private int a[] = new int[1000001];
    private static int prime[] = new int[1000001];
    public static void creatPrime(){
        Arrays.fill(prime, 1);
        prime[0] = prime[1] =0;
        for(int i = 2 ; i <= 1000 ; i++){
            if(prime[i ]== 1){
                for(int j = i * 2 ; j < 1000001; j += i){
                    prime[j] = 0 ;
                }
            }
        }
    }
        
    public FileBinary(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Integer> store = (ArrayList<Integer>)in.readObject();
        for(Integer x : store){
            if(prime[x] == 1){
                a[x] += 1;
            }
        }
    }
    
    public void showResult(FileBinary x ){
        for(int i = 2 ; i <= 1000000 ; i++){
            if(a[i] > 0){
                int val = 1000000 - i;
                if(x.a[val] > 0 && i < val){
                    System.out.println(i + " " + val);
                }
            }
        }
    }   
}
