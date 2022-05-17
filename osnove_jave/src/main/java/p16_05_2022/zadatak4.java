package p16_05_2022;

import java.util.Scanner;
public class zadatak4 {

    //4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
    // Brojevi su ulazni parametri funkcije.
    // U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        int c = 4;
        int d = 2;


        operacija(c, d);
    } static void operacija(int a, int b){
        System.out.println("Zbir je: " + (a + b));
        System.out.println("Razlika je: " + (a - b));
        System.out.println("Proizvod je: " + (a * b));
        System.out.println("Kolicnik je: " + (a / b));
    }

}
