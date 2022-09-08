package Laboratorka1;

public class Lenght {
    public static int lenght(String str, char c){
        int len = 0;
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i) == c){
                len++;
            }
        }

        return len;
    }
}
