package d03_06_2022;

public class Tetrapak extends Ambalaza {
    //Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
    //atribut koji kaze da li se moze reciklirati
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni

    //metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean daLiReciklirati;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoT, double brutoT, boolean daLiReciklirati, double osnovnaCena) {
        super(barkod, nazivArtikla, netoT, brutoT);
        this.daLiReciklirati = daLiReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak() { }

    public boolean isDaLiReciklirati() {
        return daLiReciklirati;
    }

    public void setDaLiReciklirati(boolean daLiReciklirati) {
        this.daLiReciklirati = daLiReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
//    //racuna cenu tako da ispunjava uslova:
//    //ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    //ako nije u cenu ulazi samo osnovna cena
    @Override
    public double cenaArtikla() {
        if(daLiReciklirati){
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }return  this.osnovnaCena;

    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Naziv artikla: " + this.nazivArtikla);
        System.out.println("Bruto tezina: " + this.brutoT);
        System.out.println("Neto tezina: " + this.netoT);
        if(daLiReciklirati){
            System.out.print("Ambalaza je reciklirana. Na osnovu toga cena artikla je: ");
        }else{
            System.out.print("Ambalaza nije reciklirana. Na osnovu toga cena artikla je: ");
        }
        System.out.println(this.cenaArtikla());
        System.out.println();

    }
}
