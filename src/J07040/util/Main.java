package J07040.util;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        HashSet<String> string_Binary = new HashSet<>();
        ArrayList<String> store = (ArrayList<String>)in1.readObject();
        
        for(String x : store){
            String s[] = x.toLowerCase().trim().split("\\s+");
            for(String y : s){
                string_Binary.add(y);
            }
        }
        
        LinkedHashSet<String> string_data = new LinkedHashSet<>();
        Scanner in2 = new Scanner(new File("VANBAN.in"));
        while(in2.hasNextLine()){
            String s[] = in2.nextLine().toLowerCase().trim().split("\\s+");
            for(String y: s){
                string_data.add(y);
            }
        }
        string_data.retainAll(string_Binary);
        Object[] arrayString = string_data.toArray();
        for(int i = 0 ;  i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }
    }
}
