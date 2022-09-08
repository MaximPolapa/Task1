package Laboratorka1;



public class Task8 {
    public static void main(String[] args) {
        CustomDouble first = new CustomDouble(1,0.2);
        CustomDouble second = new CustomDouble(4,0.7);
        System.out.println(first.Sum(first,second));
        System.out.println(first.Minus(second));
        System.out.println(first.equals(second));
    }
}
