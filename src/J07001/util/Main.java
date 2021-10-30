
package J07001.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
    }
}
