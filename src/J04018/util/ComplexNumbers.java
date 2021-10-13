package J04018.util;

public class ComplexNumbers {

    private int a, b;

    public ComplexNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static ComplexNumbers addComplexNumber(ComplexNumbers x1, ComplexNumbers x2) {
        ComplexNumbers res = new ComplexNumbers(0, 0);
        res.a = x1.a + x2.a;
        res.b = x1.b + x2.b;
        return res;
    }

    public static ComplexNumbers mulComplexNumber(ComplexNumbers x1, ComplexNumbers x2) {
        ComplexNumbers res = new ComplexNumbers(0, 0);
        res.a = x1.a * x2.a - x1.b * x2.b;
        res.b = x1.a * x2.b + x1.b * x2.a;
        return res;
    }

    @Override
    public String toString() {
        if(b > 0) return a + " + " + b+"i";
        else{
            b = -b ;
            return a + " - " + b +"i";
        } 
            
    }
    
}
