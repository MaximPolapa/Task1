package Laboratorka1;

public class Task1 {
    public static void main(String[] arg){
        String[] s ={"aaa", "a","aa","aaaaaaaaaaa"};
        char symbol = 'a';
        boolean isSorted = false;
        String buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < s.length-1; i++) {
                if(Lenght.lenght(s[i], symbol) > Lenght.lenght(s[i+1],symbol)){
                    isSorted = false;

                    buf = s[i];
                    s[i] = s[i+1];
                    s[i+1] = buf;
                }
            }
        }
        for (String str:s){
            System.out.println(str);
        }
    }
}
