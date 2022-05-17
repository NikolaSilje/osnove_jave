package d16_05_2022;

public class zadatak6 {
    public static void main(String[] args) {
//(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
// U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        int x = najmanjiBroj(1, 4, 9);

        System.out.println("Od tri uneta broja, najmanji je: " + x);

    } static int najmanjiBroj (int a, int b, int c){
        if(a < b && a < c){
            return a;
        } else if (b < a && b <c) {
            return b;
        }else{
            return c;
        }
    }
}