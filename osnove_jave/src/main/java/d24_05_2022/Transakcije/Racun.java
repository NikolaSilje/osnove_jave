package d24_05_2022.Transakcije;

public class Racun {
    //Zadatak
    //Kreirati klasu Racun koja ima:
    //broj racuna (npr: 170-289328923-23)
    //ime i prezime osobe
    //trenutno stanje na racunu (npr: 100, 1220)
    //gettere i setter za sve atribute, sem settera za stanje na racunu



    private String brojRacuna;
    private String imeKorisnika;
    private double stanjeNaRacunu;

    public Racun(String brojRacuna, String imeKorisnika, int stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeKorisnika = imeKorisnika;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }
    public Racun (){}

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImeKorisnika() {
        return imeKorisnika;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImeKorisnika(String imeKorisnika) {
        this.imeKorisnika = imeKorisnika;
    }
    //metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
    //metodu koja stampa podatke o racunu u formatu:
    // Ime i prezime  -  broj racuna
    //stanje na racunu je (trenutno stanje) rsd.

    public void menjaStanje(double vrednost){
        if(vrednost < 0) {
            this.stanjeNaRacunu = 0;
        }else{
            this.stanjeNaRacunu = vrednost;
        }
    }
    public void stampa(){
        System.out.println("Ime i prezime: " + this.imeKorisnika +" - br. racuna: " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.stanjeNaRacunu + "rsd");
    }

}
