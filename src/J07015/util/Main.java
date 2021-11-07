package J07015.util;

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static boolean isPrime(int n){
        if(n < 2 ) return false ;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer>store = (ArrayList<Integer>)in.readObject();
        int a[] = new int[10000];
        for(Integer x: store) a[x]++;
        for(int i = 0 ; i < 10000; i++){
            if(a[i] > 0 && isPrime(i)){
                System.out.println(i + " " + a[i]);
            }
        }           
    }
}
