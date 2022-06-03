package d02_06_2022;

import java.util.ArrayList;

public abstract class Radnik {
    //Kreirati abstraktnu klasu Radnik koja ima:
    // ime i prezime
    // niz sektora u kojima radi
    // abstraktnu metodu koja vraca platu radnika
    // metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

    protected String imeIPrezime;
    protected ArrayList<Sektor> nizSektora = new ArrayList<>();

    public Radnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public abstract double plataRadnika();

    public void zaposliSeUSektor(Sektor sektor){
        this.nizSektora.add(sektor);
    }
}
