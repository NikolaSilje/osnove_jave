package d03_06_2022;

public class StaklenaAmbalaza extends Ambalaza {
    //Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
    //kaucija za flasu
    //atribut koji kaze da li se za flasu placa kaucija
    //osnovna cena
    private double kaucija;
    private boolean kaucijaJePlacena;
    private double osnovnaCena;

    //gettere i setter za atribute
    //konstuktori koji su vam potrebni

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoT,
                            double brutoT, double kaucija, boolean kaucijaJePlacena, double osnovnaCena) {
        super(barkod, nazivArtikla, netoT, brutoT);
        this.kaucija = kaucija;
        this.kaucijaJePlacena = kaucijaJePlacena;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza() {}



    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isKaucijaJePlacena() {
        return kaucijaJePlacena;
    }

    public void setKaucijaJePlacena(boolean kaucijaJePlacena) {
        this.kaucijaJePlacena = kaucijaJePlacena;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }


    //racuna cenu
    //ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
    //ako se ne placa, (osnovna cena) * 1.2
    //metoda stampaj stampa sve podatke iz klase staklena flasa.
    @Override
    public double cenaArtikla() {
        if(this.kaucijaJePlacena){
            return this.osnovnaCena * 1.2 + this.kaucija;
        }return this.osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " + this.nazivArtikla);
        System.out.println("Bruto tezina: " + this.brutoT);
        System.out.println("Neto tezina: " + this.netoT);
        if(kaucijaJePlacena){
            System.out.print("Kaucija je placena. Na osnovu toga cena je: ");
        }else{
            System.out.print("Kaucija nije placena. Na osnovu toga cena je: ");
        }
        System.out.println(this.cenaArtikla());
        System.out.println();


    }
}
