
package J07054.util;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Students> store = new ArrayList<>();
        int n= Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Students a = new Students(i, in.nextLine(), Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()));
            store.add(a);
        }
        ArrayList<HashMap.Entry<Double, Integer>> ans = new ArrayList<>(Students.store.entrySet());
        Collections.sort(store);
        Collections.sort(ans, new Comparator<Map.Entry<Double, Integer>>(){
        @Override
        public int compare(HashMap.Entry<Double,Integer>x1, HashMap.Entry<Double,Integer>x2){
            if(x1.getKey() < x2.getKey()) return 1;
            return -1;
        }
        });
        
        for(Students a : store){
            int count = 0;
            for(HashMap.Entry<Double, Integer> x : ans){
                if(a.getAverage() < x.getKey()){
                    count += x.getValue();
                }
                if(a.getAverage() == x.getKey()){
                   a.setRank(count+1); 
                   break;
                }
            }
            System.out.println(a);
        }
    }
}
