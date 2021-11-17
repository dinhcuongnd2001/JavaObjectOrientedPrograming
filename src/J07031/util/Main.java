package J07031.util;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileBinary.creatPrime();
        FileBinary x = new FileBinary("DATA1.in");
        FileBinary y = new FileBinary("DATA2.in");
        x.showResult(y);
    }
}
