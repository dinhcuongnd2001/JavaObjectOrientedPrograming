package XauKyTu;

import java.util.*;

public class J03022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans ="";
        while(in.hasNext()){
            ans = ans + in.next() + " "; 
        }
        ans.toLowerCase().trim().replaceAll("\\s+"," ");
        String s = "";
        for(int i = 0 ; i < ans.length()-1; i++){
            if(s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!'   ){
                if(s.charAt(i+1) == ' '){
                    
                }
            }
        }
    }
}
