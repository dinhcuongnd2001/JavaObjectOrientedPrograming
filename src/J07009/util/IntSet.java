
package J07009.util;

import java.util.*;

public class IntSet {
    private int a[] ;
    TreeSet<Integer> ans = new TreeSet<>();

    public IntSet(int[] a) {
        this.a = a;
        for(int i = 0 ; i <a.length ; i++){
            ans.add(this.a[i]);
        }
    }
    public IntSet intersection(IntSet o){
        this.ans.retainAll(o.ans);
        int []b = new int [1000006];
        Object x[] = ans.toArray();
        int index = 0;
        for(Object y : x){
            b[index] = Integer.parseInt(y.toString());
            index += 1;
        }
        IntSet val = new IntSet(b);
        return val;
    }   

    @Override
    public String toString() {
        String ans = "";
        for(int i =  0 ; i < a.length ; i++){
            if(a[i] > 0){
                ans = ans + String.valueOf(a[i])+" ";
            }
        }
        return ans;
    }
}
