package p20_05_2022;

public class RadnikMain {
    public static void main(String[] args) {
        Radnik miloje = new Radnik("17099823541231", "Miloje Pekovic", 2, 2,12);
        System.out.println("Minuli rad: " + miloje.minuliRad());
        System.out.println("Koeficijent slozenosti: " + miloje.koeficijentiSlozenosti());
        System.out.println("Plata je: " + miloje.plataRanika());
        System.out.println("Da li je kreditno sposoban (true/false): " + miloje.jeKreditnoSposoban());
        System.out.println("Broj slobodnih dana: " + miloje.slobodniDani());

    }
}
