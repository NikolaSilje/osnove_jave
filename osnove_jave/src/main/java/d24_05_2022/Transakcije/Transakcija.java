package d24_05_2022.Transakcije;

public class Transakcija {

    //		Kreirati klasu Transakcija koja ima:
    //id transakcije
    //racun sa kog se prenose sredstva
    //racun na koji se prenose sredstva
    //gettere i settere
    //konstruktore

    private int idTransakcije;
    private Racun posiljalac;
    private Racun primalac;

    public Transakcija(int idTransakcije, Racun posiljalac, Racun primalac) {
        this.idTransakcije = idTransakcije;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
    }

    public Transakcija() {
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(Racun posiljalac) {
        this.posiljalac = posiljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
    //privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
    //ako je prenos sredstava manji od 4500, provizija je fiksna 45
    //ako je prenos sredstava veci od 4500, provizija je 1%
    //S obzirom da se provizija racuna na osnovu visine transakcije,
    //znaci da metoda prima parametar koji predstavlja visinu transakcije
    //Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.

    private double provizija(double vrednostTransakcije){
        if(vrednostTransakcije <= 4500){
            return 45;
        } else if (vrednostTransakcije > 4500) {
            return vrednostTransakcije / 100;
        }return 0;

    }



    //metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
    // Kao parametar funkcije se unosi vrednost koja se prebacuje.
    //Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
    // a na drugi racun dodaje samo (trazena suma).
    //(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
   public void izvrsiTransakciju(double vrednostTransakcije) {
       if (this.posiljalac.getStanjeNaRacunu() - vrednostTransakcije + provizija(vrednostTransakcije) < 0) {
           System.out.println("Nemate dovoljno sredstava na racunu za odredjenu transakciju." +
                   "Iznosi na racunima su ostali nepromenjeni");
       } else {
           this.posiljalac.menjaStanje(this.posiljalac.getStanjeNaRacunu() - vrednostTransakcije - provizija(vrednostTransakcije));
           this.primalac.menjaStanje(this.primalac.getStanjeNaRacunu() + vrednostTransakcije);
       }
   }
       //id transkacije
       //Racun sa: Ime i prezime  -  broj racuna
       //Racun na: Ime i prezime  -  broj racuna

      public void stampa () {
          System.out.println("ID transakcije: " + this.idTransakcije);
          System.out.println("Racun sa koje se salje: " +
                  this.posiljalac.getImeKorisnika() + " - " + this.posiljalac.getBrojRacuna());
          System.out.println("Racun na koji se salje: " +
                  this.primalac.getImeKorisnika() + " - " + this.primalac.getBrojRacuna());
      }
   }


