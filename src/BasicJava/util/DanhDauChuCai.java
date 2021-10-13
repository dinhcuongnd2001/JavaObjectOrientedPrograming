
package BasicJava.util;

import java.util.Scanner;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int b[] = new int[200];
        for(int i = 0 ; i < a.length() ; i++){
            b[(int)a.charAt(i)] += 1;
        }
        int count = 0;
        for(int i = 97 ; i <= 122 ; i++){
            if(b[i] > 0) count +=1;
        }
        System.out.println(count);
    }
}
