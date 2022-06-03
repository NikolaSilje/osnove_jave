package d02_06_2022;

public class Sektor {
//    Zadatak
//    Kreirati klasu Sektor koja ima:
//    naziv sektora
//    platu koja je za taj sektor

    private String nazivSektora;
    private double plataZaSektor;

    public Sektor(String nazivSektora, double plataZaSektor) {
        this.nazivSektora = nazivSektora;
        this.plataZaSektor = plataZaSektor;
    }
    public Sektor(){}

    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public double getPlataZaSektor() {
        return plataZaSektor;
    }

    public void setPlataZaSektor(int plataZaSektor) {
        this.plataZaSektor = plataZaSektor;
    }
}
