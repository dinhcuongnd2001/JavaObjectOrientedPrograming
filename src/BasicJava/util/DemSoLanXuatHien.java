
package BasicJava.util;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        byte t = In.nextByte();
        short mark[] = new short[100005];
        for(byte count = 1 ; count <= t ; count++){
            byte n = In.nextByte();
            short a[] = new short[n+5];
            for(byte i = 0 ; i < n ; i++){
                a[i] = In.nextShort();
                mark[a[i]]++;
            }
            System.out.println("Test " + count +":");
            for(byte i = 0 ; i < n ; i++){
                if(mark[a[i]] > 0){
                    System.out.println(a[i] + " xuat hien " + mark[a[i]] + " lan");
                    mark[a[i]] = 0 ;
                }
            }
        }
    }
}
