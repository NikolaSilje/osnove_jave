package d31_05_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Igrac prviIgrac = new Igrac("Nikola", "Pavlovic", "1234567", 1990, 7, "Napadac", true);
        Igrac drugiIgrac = new Igrac("Pavle", "Nikolic", "123456", 1999, 11, "Defanzivac", false);


        Trener prviTrener = new Trener("Pera", "Peric", "19754347", 1977, 7, "personalni");
        Trener drugiTrener = new Trener("Mika", "Mikic", "19345661", 1961, 15, "pomocni");

        prviIgrac.stampaj();
        drugiIgrac.stampaj();
        prviTrener.stampaj();
        drugiTrener.stampaj();

    }
}