package d19_05_2022;

public class Proizvod {

    //Napisati klasu Proizvod koja ima atribute
    //naziv proizvoda (String)
    //cenu proizvoda (double)
    //težinu proizvoda u gramima. (double)
    public String nazivProizvoda;

    public double cenaProizvoda;
    public double tezinaUGramima;

    //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
    public void stampa() {
        System.out.print("Proizvod: {{" + this.nazivProizvoda + "}}, {{" + this.cenaProizvoda + "rsd}}, {{");
        System.out.println(this.tezinaUGramima + "g}}");
    }
    //povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
    // Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.

    public void povecajCenu(double povecanje) {
        this.cenaProizvoda = this.cenaProizvoda + povecanje;
    }
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
// a povratnu vrednost je cena proizvoda kada se uračuna popust
// .Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
    public double vratiCenuSaPopustom(double popust) {
        return this.cenaProizvoda - (popust / 100) * this.cenaProizvoda;
    }
    //racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
    //za tezinu do 100g, postarina iznosi 200din
    //za tezinu od 101g do 500g, postarina iznosi 400din
    //za tezinu preko 500g, postarina iznosi 1000din

    public double racunajPostarinu() {
        if (this.tezinaUGramima <= 100) {
            return 200;
        } else if (this.tezinaUGramima > 100 && this.tezinaUGramima <= 500) {
            return 400;
        }
            return 1000;
    }
}
