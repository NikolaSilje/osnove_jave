package d23_05_2022_2;

public class Vaga {
    //	Kreirati klasu Vaga koja ima:
    //merna jedinica (kg ili lb)
    //proizvod (proizvod koji se meri)
    //TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
    //default-ni konstuktor
    //getteri i setteri za sve atribute
    //metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
    // Na racunanje cene utice i merna jedinica na koju je vaga podesena.
    //metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
    //               (sifra) - (naziv)
    //   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
    //   Ukupno: (ukupna cena)


    private String mernaJedinica;
    private Proizvod nazivProizvoda;

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(Proizvod nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }
    public double sracunajCenu(double tezina){
        if (mernaJedinica.equals("KG")){
            return this.nazivProizvoda.getCenaKg() * tezina;
        }return this.nazivProizvoda.getCenaLb() * tezina;
    }

    public Vaga() {}
//    //metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//    //               (sifra) - (naziv)
//    //   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
//    //   Ukupno: (ukupna cena)

    public void stampa (double tezina){
        this.nazivProizvoda.stampa();
    if (this.mernaJedinica.equals("KG")) {
        System.out.println(this.nazivProizvoda.getCenaKg() + " KG  * " + tezina);
    }else if(this.mernaJedinica.equals("lb")){
        System.out.println(this.nazivProizvoda.getCenaLb() + " lb * " + tezina);
    }
        System.out.println("Ukupno: " + this.sracunajCenu(tezina));


    }
}
