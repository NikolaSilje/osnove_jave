package p19_05_2022;

public class AutoMain {
    public static void main(String[] args) {

        Auto audi = new Auto();
//
        audi.imeIPrezime = "Nikola Vasiljevic";
        audi.marka = "Audi";
        audi.potrosnja = 10;
        audi.brVrata = 3;
        audi.brzina = 110;

        Auto renault = new Auto();
//
//
//        audi.stampa();
//        System.out.println();
//        renault.stampa();
//
//
//        boolean prekoracenje = audi.prekoracenje(100);
//
//        if(prekoracenje == true){
//            System.out.println("Niste prekoracili!!!");
//        }else{
//            System.out.println("Prekoracili ste!!!");
//
//
//
//           int kazna =  audi.kazna(100);
//
//            System.out.println("Kazna je: " + kazna);
//
//            int kazna2 = audi.kaznaDva(100);
//
//            System.out.println("Kazna je: " + kazna2);

            renault.imeIPrezime = "Djurjdina Milovanovic";
            renault.marka = "Audi";
            renault.potrosnja = 10;
            renault.brVrata = 4;
            renault.brzina = 100;
            renault.klimaRadiLI = true;
            renault.godProizvodnje = 1945;
            renault.kubikaza = 2500;
            renault.mesecRegistracije = 10;
            renault.trenutnaKolicinaGoriva = 50;
            renault.kapacitetRez = 100;

//        System.out.println("Da li je Renault oldtimer: " + renault.oldtimer());
//        System.out.println("Da li je Renault registrovan: " +renault.registrovan(5));
//        System.out.println("Cena registracije je: " + renault.cenaRegistracije());
          System.out.println("Cena goriva je: " + renault.natociGorivo(60));
        System.out.println("Da li istom brzinom se krecu i audi i " + audi.istaBrzina(renault));

        }
    }

