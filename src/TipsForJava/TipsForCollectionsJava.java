package TipsForJava;

import java.util.*;

public class TipsForCollectionsJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        int n = 6;
        for(int i = 0 ; i < 6 ; i++){
            ans.add(in.nextLine());
        }
        
        // in ra danh sach String co trong ArrayList
        
        for(String x : ans){
            System.out.println(x);
        }
        //sap xep ArrayList voi Collections
        
        Collections.sort(ans);
        for(String x : ans){
            System.out.println(x);
        }
        /*
        sap xep nang cao doi voi cac Objects
        vd sap xep mot arrayList chua cac cap gia tri
            ArrayList<HashMap.Entry<String, Integer>> res = new ArrayList<>(store.entrySet());
            Collections.sort(res, new Comparator<HashMap.Entry<String, Integer>>(){
            @Override
            public int compare(HashMap.Entry<String, Integer> x1, HashMap.Entry<String, Integer> x2 ){
                if(x1.getValue() < x2.getValue()) return 1;
                else if(x1.getValue() == x2.getValue()){
                    return x1.getKey().compareTo(x2.getKey());
                }
                return -1;
            }
        });
        */
    }
}
