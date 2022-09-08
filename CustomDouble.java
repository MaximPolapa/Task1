package Laboratorka1;

import java.util.Objects;

public class CustomDouble {
    private int integ;
    private double doub;

    public int getInteg() {
        return integ;
    }

    public void setInteg(int integ) {
        this.integ = integ;
    }

    public double getDoub() {
        return doub;
    }

    public void setDoub(double doub) {
        this.doub = doub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomDouble that = (CustomDouble) o;
        return integ == that.integ && Double.compare(that.doub, doub) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(integ, doub);
    }

    public CustomDouble(final int integer, final double doubl) {
        this.integ = integer;
        this.doub = doubl;
    }

    public CustomDouble(final double result) {
        this.integ = (int) result;
        this.doub = result - integ;
    }
    public double toDouble() {
        return (double) integ + doub;
    }
    public CustomDouble Sum (final CustomDouble first, final CustomDouble second) {
        final double result = first.toDouble() + second.toDouble();
        return new CustomDouble(result);
    }


    public CustomDouble Minus(final CustomDouble numeric) {
        final double result = this.toDouble() - numeric.toDouble();
        return new CustomDouble(result);
    }

    public String toString() {
        return Double.toString(toDouble());
    }


    public static long multipl(final long n1, final long n2) {
        return n1 * n2;
    }

    public static CustomDouble mult(final CustomDouble n1, final CustomDouble n2) {
        CustomDouble s = new CustomDouble((int) (n1.toDouble() * n2.toDouble()),
                n1.toDouble() * n2.toDouble() - (int) (n1.toDouble() * n2.toDouble()));
        ;
        return s;
    }

    public static CustomDouble div(final CustomDouble n1, final CustomDouble n2) {
        if (n2.toDouble() == 0) {
            throw new NullPointerException("Exception: n2 is null!");
        } else return new CustomDouble((int) (n1.toDouble() / n2.toDouble()),
                n1.toDouble() / n2.toDouble() - (int) (n1.toDouble() * n2.toDouble()));

    }



}