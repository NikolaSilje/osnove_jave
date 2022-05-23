package d19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod mis = new Proizvod();

        mis.nazivProizvoda = "Logitech";
        mis.cenaProizvoda = 2800;
        mis.tezinaUGramima = 99.99;

        Proizvod mobTelefon = new Proizvod();

        mobTelefon.nazivProizvoda = "Honor";
        mobTelefon.cenaProizvoda = 23399;
        mobTelefon.tezinaUGramima = 150;

        mis.stampa();
        mobTelefon.stampa();
        System.out.println();

        mis.povecajCenu(100);
        mobTelefon.povecajCenu(300);

        System.out.println("Cena proizvoda " + mis.nazivProizvoda + " posle povecanja iznosi: "  + mis.cenaProizvoda + "rsd.");
        System.out.print("Cena proizvoda " + mobTelefon.nazivProizvoda + " posle povecanja iznosi: ");
        System.out.println( mobTelefon.cenaProizvoda + "rsd.");
        System.out.println();
        double cenaPoslePopustaMis = mis.vratiCenuSaPopustom(20);
        double cenaPoslePopustaMob = mobTelefon.vratiCenuSaPopustom(50);

        System.out.println("Cena proizvoda " + mis.nazivProizvoda + " posle popusta od 20% je "  + cenaPoslePopustaMis + "rsd.");
        System.out.print("Cena proizvoda " + mobTelefon.nazivProizvoda + " posle popusta od 50% je ");
        System.out.println(cenaPoslePopustaMob + "rsd.");
        System.out.println();

        double postarinaMis = mis.racunajPostarinu();
        double postarinaMob = mobTelefon.racunajPostarinu();

        System.out.println("Cena postarine proizvoda " + mis.nazivProizvoda + " iznosi "  + postarinaMis + "rsd.");
        System.out.println("Cena postarine proizvoda " + mobTelefon.nazivProizvoda + " iznosi "  + postarinaMob + "rsd.");









    }
}
