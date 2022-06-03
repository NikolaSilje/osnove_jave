package d02_06_2022;

public class Magacioner extends Radnik {

    //    Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:



    public Magacioner(String imeIPrezime) {
        super(imeIPrezime);
    }

//    ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//    suma plata svih sektor / broj sektora * 0.5
    private double prosecnaPlataPoSektoru(){
        double prosecnaPlata = 0;
        for (int i = 0; i < this.nizSektora.size(); i++) {
            prosecnaPlata += this.nizSektora.get(i).getPlataZaSektor();

        }
        return prosecnaPlata / this.nizSektora.size() * 0.5;

    }
//    override uje metodu za platu, tako da se plata racuna po formuli:
//            (prosecna plata za sve sektore u kojima radi) * (broj sektora).

    @Override
    public double plataRadnika() {
        return prosecnaPlataPoSektoru() * this.nizSektora.size();
    }


}
