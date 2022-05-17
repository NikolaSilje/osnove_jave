package p16_05_2022;

public class zadatak8 {
    //8. Zadatak
    //Napisati metodu koja proverava da li je trougao pravougli.
    // Metoda prima stranice trougla i hipotenuzu trougla.
    // Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
    //Trougao je pravougli ukoliko je a*a+b*b=c*c

    public static void main(String[] args) {
        boolean trougao = pravougliTrougao(4, 8, 12);
        System.out.println(trougao);
    }
    static boolean pravougliTrougao(int a, int b, int c){
        if (a*a + b*b == c){
            return true;
        }else {
            return false;
        }
    }
}
