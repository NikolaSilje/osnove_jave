package p18_05_2022;

import java.util.Scanner;

public class MainKorisnik {
    public static void main(String[] args) {
//        String ime1 = "Milan";
//        String prezime = "Jovanovic";
//        int godisne1 = 27;

//        Korisnik n =  new Korisnik();
//        n.ime = "Nikola";
//        n.prezime = "Vasiljevic";
//        n.godina = 28;
//        n.mail = "Djika@gmail.com";
//
//
//        System.out.println("Ime " + n.ime);
//        System.out.println("Prezime " + n.prezime);
//        System.out.println("Godine " + n.godina);
//        System.out.println("Email " + n.mail);
//
//
//        Korisnik dj =  new Korisnik();
//
//        dj.ime = "Djurdjina";
//        dj.prezime = "Milovanovic";
//        dj.godina = 28;
//        dj.mail = "Nikolav.silje@gmail.com";
//
//
//
//        System.out.println("Kraj");
        Scanner s = new Scanner(System.in);
        Racun n =  new Racun();

        n.brRacun = "8423-5659-54450";
        n.imeIPrezime = "Nikola Vasiljevic";
        n.stanje = 1200;

        Racun d =  new Racun();

        d.brRacun = "842-4554-45454";
        d.imeIPrezime = "Djurdjina Milovanovic";
        d.stanje = 15000;


        System.out.println("Broj racuna je: " + n.brRacun + " ,Ime i prezime je: "+ n.imeIPrezime +  ",stanje je: "+ n.stanje );
       System.out.println("Broj racuna je: " + d.brRacun + " ,Ime i prezime je: "+ d.imeIPrezime +  ",stanje je: "+ d.stanje );

        System.out.println("Unesite sumu za transakciju");
        int transakcija = s.nextInt();

        n.stanje = n.stanje - transakcija;
        d.stanje = d.stanje + transakcija;

        System.out.print("Posaljilac: Broj racuna je: " + n.brRacun + " ,Ime i prezime je: ");
        System.out.println( n.imeIPrezime +  ",stanje je: "+ n.stanje );
        System.out.print("Primalac: Broj racuna je: " + d.brRacun + " ,Ime i prezime je: ");
        System.out.println(d.imeIPrezime +  ",stanje je: "+ d.stanje );



    }
}
