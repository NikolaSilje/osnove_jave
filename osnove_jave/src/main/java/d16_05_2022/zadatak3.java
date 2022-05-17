package d16_05_2022;

public class zadatak3 {
//Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.


    public static void main(String[] args) {
       podaciOkorisniku("1709994733535", "Nikola", "Vasiljevic", 1994, true);

    }
    static void podaciOkorisniku (String jmbg, String ime, String prezime, int god, boolean aktivnost){
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God rodjenja:  " + god);
        System.out.println("Aktivan: " + aktivnost);
    }
}