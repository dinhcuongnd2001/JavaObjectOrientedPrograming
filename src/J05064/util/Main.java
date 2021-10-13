
package J05064.util;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Salary> store = new ArrayList<>();
        HashMap<String, Integer> ans = new HashMap<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            Salary x = new Salary(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()));
            if(x.getPosition().equals("HT")){
                if(ans.containsKey(x.getPosition()) == false){
                    store.add(x);
                    ans.put(x.getPosition(), 1);
                }
            }
            else if(x.getPosition().equals("HP")){
                ans.put(x.getPosition(), ans.getOrDefault(x.getPosition(), 0) + 1);
                if(ans.get(x.getPosition()) <= 2){
                    store.add(x);
                }
            }
            else store.add(x);
        }
        for(Salary x : store){
            System.out.println(x);
        }
    }
}
