
package BasicJava.util;

import java.util.*;
import java.io.*;

public class HelloFile {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("Hello.txt"));
        while(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
    }
}
