package p16_05_2022;

public class zadatak9 {
    public static void main(String[] args) {

        //Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
        //1 - I
        //2 - II
        //3 - III
        //4 - IV
        //5 - V
        //6 - VI
        //7 - VII
        //8 - VIII
        //9 - IX
        //10 - X
        //
        //Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
        //Ako se unese VIII vraca se 8.
        //
        //VIII => 8

        int broj = konverzija("IX");
        System.out.println(broj);

    }

    static int konverzija(String arapski) {
        if (arapski.equals("I")) {
            return 1;
        } else if (arapski.equals("II")) {
            return 2;
        } else if (arapski.equals("III")) {
            return 3;
        } else if (arapski.equals("IV")) {
            return 4;
        } else if (arapski.equals("V")) {
            return 5;
        } else if (arapski.equals("VI")) {
            return 6;
        } else if (arapski.equals("VII")) {
            return 7;
        } else if (arapski.equals("VIII")) {
            return 8;
        } else if (arapski.equals("IX")) {
            return 9;
        } else if (arapski.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }
}
