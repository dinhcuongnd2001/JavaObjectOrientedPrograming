
package J07023.util;

import java.util.*;
import java.io.*;
public class setPrime {
    private int a[] = new int[10005];
    private static int arrayPrime[] = new int [10005];
    
    public static void creatArrayIsprime(){
        Arrays.fill(arrayPrime,1);
        arrayPrime[0] = arrayPrime[1] = 0;
        for(int i = 2; i <= 100; i++){
            if(arrayPrime[i] == 1){
               for(int j = 2*i ; j <= 10000; j += i){
                   arrayPrime[j] = 0 ;
               } 
            }
        }
    }
    
    public boolean reverse(int a){
        StringBuilder s = new StringBuilder(String.valueOf(a));
        return s.toString().equals(s.reverse().toString());
    }
    
    public setPrime(String file) throws IOException, ClassNotFoundException {
           ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
           ArrayList<Integer>store = (ArrayList<Integer>)in.readObject();
           for(Integer x : store){
               if(arrayPrime[x] == 1){
                   a[x]++;
               }
           }
    }
    public void showResult(setPrime x){
        for(int i = 0 ; i <= 10002 ; i++){
          if(this.a[i] > 0 && x.a[i] > 0){
            if(reverse(i)){      
             System.out.println(i + " " + this.a[i] + " " + x.a[i]);
            }  
          }
        }
    }
}
