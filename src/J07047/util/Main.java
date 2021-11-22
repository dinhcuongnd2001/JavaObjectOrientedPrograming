
package J07047.util;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(new File("DATA.in"));
       //Scanner in = new Scanner(new File("C:\\Users\\Admin\\Desktop\\DATA.txt"));
        ArrayList<Rooms> stR = new ArrayList<>();
        ArrayList<InfoClients> stC = new ArrayList<>();
       int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n ; i++){
            Rooms a = new Rooms(in.nextLine());
            stR.add(a);
        }
        n = Integer.parseInt(in.nextLine());
        for(int i = 1 ; i <= n ; i++){
            InfoClients a = new InfoClients(i , in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            stC.add(a);
        }
        
        for(InfoClients x : stC){
            for(Rooms y : stR){
                if(x.getIdRoom().equals(y.getId())){
                    x.setR(y);
                    break;
                }
            }
        }
        Collections.sort(stC);
        for(InfoClients x : stC){
            System.out.println(x);
        }
    }
    
}
