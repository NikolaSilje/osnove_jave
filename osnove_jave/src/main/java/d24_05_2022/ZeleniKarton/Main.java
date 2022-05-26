package d24_05_2022.ZeleniKarton;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> nizKartona = new ArrayList<ZeleniKarton>();


        System.out.println("Unesite ime i prezime studenta: ");
        String imeStudenta = s.next();
        System.out.println("Unesite broj indeksa: ");
        String brojIndeksa = s.next();
        System.out.println("Unesite broj ispita(n): ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite naziv predmeta: ");
            String nazivPredmeta = s.next();
            System.out.println("Unesite ime profesora: ");
            String nazivProfesora = s.next();
            System.out.println("Unesite ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton x = new ZeleniKarton(imeStudenta, nazivPredmeta, nazivProfesora, brojIndeksa, ocena);
            nizKartona.add(x);

        }
//           1. kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

//        for (int i = 0; i < nizKartona.size(); i++) {
//            nizKartona.get(i).stampa();
//            System.out.println();
//  }


//          2. (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//          (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
        double suma = 0;
        double sumaPolozeni = 0;
        int brojac = 0;

        for (int i = 0; i < nizKartona.size(); i++) {
            suma = suma + nizKartona.get(i).getOcena();
            if(nizKartona.get(i).getOcena() > 5){
                brojac = brojac + 1;
                sumaPolozeni = sumaPolozeni + nizKartona.get(i).getOcena();
            }
        }
        System.out.println("Prosecna ocena svih ispita je: " + suma / n);
        System.out.println("Prosecna ocena polozenih ispita je: " + sumaPolozeni / brojac);











    }
}
