package p16_05_2022;

import java.util.Scanner;

public class zadatak10 {
    public static void main(String[] args) {
        //4.  Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
        // Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB)
        // a vraca konvertovanu vrednost.
        // U glavnom programu pozvati funkciju za neki od primera.
        //Primer poziva funkcija:
        //Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
        //Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
        //Primer izvrsenja main programa:
        //Unesite vrednost u eurima: 3
        //Unesite valutu za konverziju: RSD
        //3 EUR je 351.6339 RSD
        //Konverzija eura u druge valute:
        //1 EUR = 117.2113 RSD
        //1 EUR = 1.1821 USD
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u evrima: ");
        int vrednost = s.nextInt();
        System.out.println("Unesite valutu za konverziju(RSD/USD): ");
        String valuta = s.next();
        double promenjen = konverzija(vrednost, valuta);


        if(valuta.equals("USD") || valuta.equals("RSD")) {
            System.out.println(vrednost + " EUR je " + promenjen + " " + valuta);
        }else{
            System.out.println("Uneli ste neodgovarajucu valutu.");
        }

    }
    static double konverzija (double vrednost, String valuta) {
        if (valuta.equals("RSD")){
            return vrednost * 117.2113;
        }else {
            return vrednost * 1.1821;
        }
    }
}
