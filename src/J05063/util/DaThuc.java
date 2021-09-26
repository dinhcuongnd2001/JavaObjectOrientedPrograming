
package J05063.util;

import java.util.HashMap;
import java.util.Map;

public class DaThuc {
    private String a ;

    public DaThuc(String a) {
        this.a = a;
    }
    
    public DaThuc cong(DaThuc b){
        DaThuc r = new DaThuc("");
        HashMap<Integer , Integer> x1 = new HashMap<>() , x2 = new HashMap<>();
        String []a1 = a.split("[*x^ +]+");
        String []a2 = b.a.split("[*x^ +]+");
        for(int i = 1 ; i < a1.length ; i += 2){
            x1.put(Integer.valueOf(a1[i]), Integer.valueOf(a1[i-1]));
        }
        
        for(int i = 1 ; i < a2.length ; i += 2){
            x2.put(Integer.valueOf(a2[i]), Integer.valueOf(a2[i-1]));
        }
        
        for(Integer x : x1.keySet()){
            if(x2.containsKey(x)){
                x2.put(x, x2.get(x) + x1.get(x));
            }
            else
                x2.put(x, x1.get(x));
        }
        String ans = "";
        for(Map.Entry<Integer, Integer> entry : x2.entrySet()){
            ans = String.valueOf(entry.getValue()) + "*x^" + String.valueOf(entry.getKey()) + " + "+ ans;
        }
        ans = ans.substring(0 , ans.length()-3);
        //ans = new StringBuilder(ans).reverse().toString();
        r.a = ans ;
        return r ;
    }

    @Override
    public String toString() {
        return a;
    }
    
}
