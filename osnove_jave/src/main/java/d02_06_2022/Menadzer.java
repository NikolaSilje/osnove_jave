package d02_06_2022;

public class Menadzer extends Radnik {
    //Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
    // override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.


    public Menadzer(String imeIPrezime) {
        super(imeIPrezime);
    }

    @Override
    public double plataRadnika() {
        double sumaPlata = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            sumaPlata += nizSektora.get(i).getPlataZaSektor();
        }
        return sumaPlata;
    }

}
