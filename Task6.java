package Laboratorka1;

import static java.lang.System.out;

public class Task6 {
    public static void main(String[] arg){
        User polapa = new User("Maxim", "Polapa", "18", "polapa.com");
        User nepolapa = new User("Max", "Polap", "18", "nepolapa.com");
        out.println(polapa.equals(nepolapa));
        out.print(nepolapa.hashCode());

    }
}
