package J07016.util;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        setPrime.creatArrayIsprime();
        setPrime x = new setPrime("DATA1.in");
        setPrime y = new setPrime("DATA2.in");
        x.showResult(y);
    }
}
