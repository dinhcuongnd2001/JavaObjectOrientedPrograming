package J07029.util;

import java.util.*;
import java.io.*;

public class Main {
    private static int[]  prime = new int[1000001];
    
    public static void createPrime(){
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0 ;
        for(int i = 2 ; i <= 1000 ; i++){
            if(prime[i] == 1){
                for(int j = i * 2; j < 1000001 ; j += i){
                    prime[j] = 0 ;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream  in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> store = (ArrayList<Integer>)in.readObject();
        createPrime();
        int a[] = new int[1000001] , count = 0;
        for(Integer x : store){
            if(prime[x] == 1){
                a[x] += 1 ;
            }
        }
        for(int i = 1000000 ; i >= 0 ; i--){
            if(a[i] > 0){
                count += 1 ;
                System.out.println(i + " " + a[i]);
            }
            if(count == 10) break;
        }
    }
}
