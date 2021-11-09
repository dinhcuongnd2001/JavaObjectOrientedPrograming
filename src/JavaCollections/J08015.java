package JavaCollections;

import java.io.*;
import java.util.*;

public class J08015 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
//        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        HashMap<Long, Long> store = new HashMap<>();
        while(test-->0){
            store.clear();
            int count = 0 ;
            long n = in.nextLong(), k= in.nextLong();
            for(int i = 0 ; i < n ; i++){
                long x = in.nextLong();
                store.put(x, store.getOrDefault(x, 0l) + 1);
            }
            for(HashMap.Entry<Long, Long> x : store.entrySet()){
                if(store.containsKey(k-x.getKey())){
                    count += Math.max(store.get(x.getKey()), store.get(k-x.getKey()));
                }
            }
            System.out.println(count/2);
        }
    }
}
