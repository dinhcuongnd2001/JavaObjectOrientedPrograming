
package J04018.util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1 ;i <= n ; i++){
            ComplexNumbers a = new ComplexNumbers(in.nextInt(), in.nextInt()), b = new ComplexNumbers(in.nextInt() , in.nextInt());
            ComplexNumbers val = ComplexNumbers.addComplexNumber(a, b);
            System.out.println(ComplexNumbers.mulComplexNumber(val, a) + ", " + ComplexNumbers.mulComplexNumber(val, val));
        }
    }
}
