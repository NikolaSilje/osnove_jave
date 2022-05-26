package d24_05_2022.Transakcije;

public class Main {
    public static void main(String[] args) {

        Racun prviKorisnik = new Racun("15654-55646-566", "Marko Markovic", 2000);
        prviKorisnik.stampa();
        Racun drugiKorisnik = new Racun("9564-45965-54654", "Milos Obiilic", 5000);
        drugiKorisnik.stampa();
        System.out.println();
        Transakcija prva = new Transakcija(5,prviKorisnik,drugiKorisnik);
        prva.stampa();
        prva.izvrsiTransakciju(3000);
        System.out.println();
        System.out.println("Posle izvrsene transakcije stanje na racunu je sledece: ");
        System.out.println();

        prviKorisnik.stampa();
        drugiKorisnik.stampa();





    }
}
