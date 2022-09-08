package Laboratorka1;

public class Calculator {

    public static long multiply(final long n1, final long n2) {
        return n1 * n2;
    }

    public static CustomDouble multiply(final CustomDouble n1, final CustomDouble n2) {
        CustomDouble s = CustomDouble.mult(n1, n2);
        return s;
    }

    public static CustomDouble division(final CustomDouble n1, final CustomDouble n2) {;
        CustomDouble s = CustomDouble.div(n1,n2);
        return s;

    }
}
