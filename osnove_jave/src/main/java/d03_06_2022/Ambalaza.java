package d03_06_2022;

public abstract class Ambalaza {
    //Kreirati abstraktnu klasu Ambalaza koja ima:
    //barkod (primer: 328232-2823)
    //naziv artikla
    //neto tezinu
    //bruto tezinu
    //konstuktore (default-ni i sa parametrima)
    //gettere i settere

    protected String barkod;
    protected String nazivArtikla;
    protected double netoT;
    protected double brutoT;

    public Ambalaza(String barkod, String nazivArtikla, double netoT, double brutoT) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoT = netoT;
        this.brutoT = brutoT;
    }

    public Ambalaza() {
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoT() {
        return netoT;
    }

    public void setNetoT(double netoT) {
        this.netoT = netoT;
    }

    public double getBrutoT() {
        return brutoT;
    }

    public void setBrutoT(double brutoT) {
        this.brutoT = brutoT;
    }
    //    //metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
    public double tezinaPakovanja(){
        return this.brutoT - this.netoT;
    }
    //    //abstraktnu metodu koja vraca cenu artikla

    public abstract double cenaArtikla();

    // abstraktnu metodu stampaj

    public abstract void stampaj();

}
