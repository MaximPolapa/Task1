package Laboratorka1;

import static java.lang.System.out;

public class Task3{

    public static int factorial(final int n){
        int kon = 1;
        for(int i = 1; i<=n;i++){
            kon *= i;
        }
        return kon;
    }
    public static void main(String[] args){
        out.print(factorial(5));
    }
}
