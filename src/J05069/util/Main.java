
package J05069.util;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<InforMatch> listInForMatch = new ArrayList<>();
        ArrayList<Club> listClub = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n ; i++){
            Club a= new Club(in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()));
            listClub.add(a);
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= m ; i++){
            InforMatch a = new InforMatch(in.next() , in.nextLong());
            listInForMatch.add(a);
        }
        for(InforMatch x : listInForMatch){
            for(Club y : listClub){
                if(y.getId().equals(x.getId())){
                    x.setNameFb(y.getName());
                    x.setProfit(y.getCost());
    
                    break;
                }
            }
        }
//        Collections.sort(listInForMatch);
        for(InforMatch x : listInForMatch){
            System.out.println(x);
        }
    }
}
