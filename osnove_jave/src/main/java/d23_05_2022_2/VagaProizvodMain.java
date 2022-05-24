package d23_05_2022_2;

import p23_05_2022.ProzivodKupacKarticaMain;

public class VagaProizvodMain {
    public static void main(String[] args) {
        Proizvod secer = new Proizvod("123-546-789","Secer", 50 );

        Vaga kg = new Vaga();
        kg.setMernaJedinica("KG");
        kg.setNazivProizvoda(secer);
        kg.stampa(10);
        System.out.println();
        Proizvod pelene = new Proizvod( "123-514-568", "Pelene", 50);
        Vaga lb = new Vaga();
        lb.setMernaJedinica("lb");
        lb.setNazivProizvoda(pelene);
        lb.stampa(10);
    }
}
