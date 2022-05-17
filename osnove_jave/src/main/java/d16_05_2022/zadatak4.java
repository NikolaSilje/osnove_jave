package d16_05_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
//Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
//  / / / / /
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj ponavljanja stampe odredjenog karaktera: ");
        int n = s.nextInt();
        System.out.println("Unesite karakter: ");
        String karakter = s.next();

        stampa(n, karakter);



    } static void stampa (int n, String karakter){
        System.out.print("<=");
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");
        }
    }
}
