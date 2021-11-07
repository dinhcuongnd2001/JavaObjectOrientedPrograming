package J07023.util;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        setPrime.creatArrayIsprime();
        setPrime x = new setPrime("DATA1.in");
        setPrime y = new setPrime("DATA2.in");
        x.showResult(y);
    }
}
