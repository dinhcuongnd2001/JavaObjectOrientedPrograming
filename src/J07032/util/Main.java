package J07032.util;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        FileBinary x = new FileBinary("DATA1.in");
        FileBinary y = new FileBinary("DATA2.in");
        x.showResult(y);
    }
}
