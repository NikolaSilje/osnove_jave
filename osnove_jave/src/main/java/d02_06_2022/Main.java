package d02_06_2022;

public class Main {
    public static void main(String[] args) {
        //U glavnom programu kreirati jednog magacionera i jednog menadzera,
        // postaviti sektore u kojima rade i ispisati platu za svakog

        Sektor s1 = new Sektor("Sektor 1", 50000);
        Sektor s2 = new Sektor("Sektor 2", 90000);
        Sektor s3 = new Sektor("Sektor 3", 100000);
        Sektor s4 = new Sektor("Sektor 4", 110000);

        Magacioner nikola = new Magacioner("Nikola Vasilejvic");
        Menadzer stanko = new Menadzer("Stanko Stanokovic");

        nikola.zaposliSeUSektor(s1);
        nikola.zaposliSeUSektor(s2);
        stanko.zaposliSeUSektor(s4);
        stanko.zaposliSeUSektor(s3);

        System.out.println("Magacioner: " + nikola.imeIPrezime + ", Prosecna plata po sektoru: " + nikola.plataRadnika());
        System.out.println("Menadzer: " + stanko.imeIPrezime + ", Ukupna plata: " + stanko.plataRadnika());
    }
}
