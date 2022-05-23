package p19_05_2022;

public class Auto {
    //Kreirati klasu Auto koja ima:
    //ime i prezime vozaca
    //marku automobila
    //broj vrata
    //potrosnju na 100km (npr: 10)
    //trenutnu brzinu kojom se auto krece
    //metodu za stampu koja stampa podatke u formatu:
    //[Vozac]
    //	[Marka] - [br vrata]-ro vrata
    //	Sa potrosnjom od [potrosnja] l na 100km
    //	[Trenutna brzina auta] km/h je trenutna brzina.
    //
    //	Primer:
    //	Milan Jovanovic
    //	BMW - 5-ro vrata
    //	Sa potrosnjom od 10 l na 100km
    //	200 km/h je trenutna brzina

    public String imeIPrezime;
    public String marka;
    public int brVrata;
    public double potrosnja;
    public double brzina;

    public String brojRegistracije;

    public boolean klimaRadiLI;

    public double godProizvodnje;

    public int mesecRegistracije;

    public double kubikaza;

    public double kapacitetRez;

    public double trenutnaKolicinaGoriva;



    public void stampa() {
        System.out.println(this.imeIPrezime);
        System.out.println(this.marka + " - " + this.brVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnja + "na 100km");
        System.out.println(brzina + "km/h je trenutna brzina.");
    }
    //U okviru klase Auto, implementirati jos 2 metode:
    //metoda koja vraca informaciju da li je vozac prekoracio brzinu.
    // Kao parametar metode se prima ogranicenje (kao broj) a
    // metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
    //metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din
    // . Metoda od parametara prima ogranicenje brzine
    //U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.


    public boolean prekoracenje(int ogranicenje) {
        if (ogranicenje < this.brzina) {
            return true;
        } else {
            return false;
        }
    }


    public double kazna(double ogranicenje) {
        if (ogranicenje > brzina) {
            return 0;
        } else {
            return (this.brzina - ogranicenje) * 1000;
        }

    }
    public int kaznaDva (int ogranicenje){
        double razlika = brzina - ogranicenje;
        int kazna = 0;

        for (int i = 0; i < razlika; i++) {
            kazna = kazna + 1000;

        }return kazna;
    }

//  Dopuniti klasu Auto tako da ima:
//atribut broj registracije
//da li je ukljucena klima u autu
//metodu dodajGas, koja povecava trenutnu brzinu za 10.
//metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

    public void dodajGas(){
        this.brzina = this.brzina + 10;
    }

    public void smanjiGas(){
        if (this.brzina - 10 < 0){
            this.brzina = 0;
        }else{
            this.brzina = this.brzina - 10;
        }
        //metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
    }public double trenutnaPotrosnja (){
        if (klimaRadiLI){
          return ((this.brzina / 100) * this.potrosnja) * 1.2;
        }
        return ((this.brzina / 100) * this.potrosnja) * 1.0;
    }
    //Dopuniti klasu Auto tako da ima:
    //atribut godinu proizvodnje
    //atribut mesec do kad je registrovan auto (int)
    //atribut kubikaza auta (npr: 1600 - 5000)
    //metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
    //metodu koja vraca da li je istekla registracije.
    // Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
    //metodu koja racuna i vraca cenu registracije za auto.
    // Za automobile do 2000 kubika cena registracije kubikaza * 100din,
    // za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

    public boolean oldtimer(){
        if(this.godProizvodnje <= 1950){
             return true;
        }return false;
    }
    public double cenaRegistracije(){
        if(this.kubikaza < 2000){
            return this.kubikaza * 100;
        }
        return this.kubikaza * 100 * 1.3;
    }
    public boolean registrovan (int mesec){
        if(mesec > this.mesecRegistracije){
            return true;
        }return false;
    }
    //Dopuniti klasu Auto tako da ima:
    //kapacitet rezervoara
    //trenutnu kolicinu goriva u rezervoaru (u litrima)
    //metodu natoci gorivo, metoda prima kao parametar litrazu goriva
    // koja se toci a vraca novcanu vrednost goriva. Litar goriva je 170din.
    // Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara,
    // takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.

    public double natociGorivo(double litrazaGoriva) {
        if (litrazaGoriva + this.trenutnaKolicinaGoriva > this.kapacitetRez) {
            return (this.kapacitetRez - this.trenutnaKolicinaGoriva) * 170;
        }
        return litrazaGoriva * 170;

    }
    //(Dopuna 6 za vezbanje)
    //Dopuniti klasu Auto, tako da ima
    //metodu koja vraca da li auto nad kojim je pozvana metoda ide istom brzinom kao i auto sa kojim se poredi.
    // Ova metoda poredi brzinu sa drugim autom, i parametar metode treba da bude tipa Auto.
    //HINT: Ova metoda treba da se ponasa kao metoda equals za stringove.
    // Zovemo metodu nad jednim stringom i poredimo ga sa drugim, tako i ovde zovemo
    // metodu nad jednim autom i poredimo ga sa drugim (NE SA BRZINOM DRUGOG, NEGO BAS SA AUTOM)

    public boolean istaBrzina(Auto audi){
        if(this.brzina == audi.brzina){
            return true;
        }
        return false;
    }

}








