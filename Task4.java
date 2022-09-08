package Laboratorka1;

import static java.lang.System.out;

public class Task4 {
    public static void fizzbuzz(){
        for(int i = 1; i<=100; i++){
            if (i%3 == 0 && i%5 == 0) {
                out.println("FizzBuzz");
            } else
            if( i%3 == 0){
                out.println("Fizz");
            } else if (i%5 == 0) {
                out.println("Buzz");
            }
            else out.println(i);
        }
    }
    public static void main(String[] args){
        fizzbuzz();
    }
}
