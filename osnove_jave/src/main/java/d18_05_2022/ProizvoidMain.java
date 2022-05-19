package d18_05_2022;

public class ProizvoidMain {
    public static void main(String[] args) {
        Proizvod b =  new Proizvod();

        b.nazivProizvoda = "Brasno";
        b.cenaProizvoda = 80.55;
        b.tezinaUGramima = 1000;

        Proizvod m =  new Proizvod();

        m.nazivProizvoda = "So";
        m.cenaProizvoda = 50.25;
        m.tezinaUGramima = 1000;

        Proizvod.stampa(b.nazivProizvoda, b.cenaProizvoda, b.tezinaUGramima);
        Proizvod.stampa(m.nazivProizvoda, m.cenaProizvoda, m.tezinaUGramima);








    }
}
