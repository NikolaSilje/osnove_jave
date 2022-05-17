package p16_05_2022;

public class zadatak5 {
    public static void main(String[] args) {
//Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.
        apsolutnaVrednost(5);

    }

    private static void apsolutnaVrednost(int a){
        if (a < 0){
            System.out.println(-a);
}           else {
                System.out.println(a);
    }
            }
}