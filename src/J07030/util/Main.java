package J07030.util;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileBinary.creatPrime();
        FileBinary a = new FileBinary("DATA1.in");
        FileBinary b = new FileBinary("DATA2.in");
        a.showResult(b);
    }
}
