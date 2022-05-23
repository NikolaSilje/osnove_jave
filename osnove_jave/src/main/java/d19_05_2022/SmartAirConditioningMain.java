package d19_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {



    SmartAirConditioning lg = new SmartAirConditioning();

    lg.markaKlime = "LG";
    lg.potrosnjaHladjenje = 1.4;
    lg.potrosnjaGrejanje = 1.7;
    lg.mod = "hladi";

    double potrosnjaLgUKw = lg.mesecnaPotrosnjaUKw();

        System.out.println("Mesecna potrosnja " + lg.markaKlime + " iznosi: " + potrosnjaLgUKw + "Kw/h");

    double potrosnjaUNovcu = lg.mesecnaPotrosnjaUNovcu();

        System.out.println("Mesecna potrsonja " + lg.markaKlime + " iznosi: " + potrosnjaUNovcu + "rsd");


    }
}
