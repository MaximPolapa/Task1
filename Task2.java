package Laboratorka1;

import static java.lang.System.out;

public class Task2{
    public static String delete(final String g, final String sumv){
        return g.replace(sumv,"");
    }
    public static void main(String[] args){
        String g = "qwerty!!";
        String sumv = "!";
        out.print(delete(g,sumv));
    }
}
