package d23_05_2022_1;

public class AutorKnijgaMain {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setImeAutora("Ivo");
        autor1.setPrezimeAutora("Andric");

        Knjiga knjiga1 = new Knjiga("9788661050930", "Na Drini cuprija",1945, autor1 );
        knjiga1.stampaj();
        System.out.println();

        Knjiga knjiga2 = new Knjiga();
        knjiga2.setIsbn("978-86-521-3927-9");
        knjiga2.setGodinaIzdanja(1972);
        knjiga2.setNaziv("Znakovi pored puta");
        knjiga2.setAutor(autor1);
        knjiga2.stampaj();
        System.out.println();

        Autor autor2 = new Autor("J.R.R.", "Tolkien");
//        autor2.stampa();

        Knjiga knjiga3 = new Knjiga("9780261102422", "The Silmarillion", 1977, autor2);
        knjiga3.stampaj();
        System.out.println();

        Knjiga knjiga4 = new Knjiga();
        knjiga4.setAutor(autor2);
        knjiga4.setNaziv("The Lays of Beleriand");
        knjiga4.setGodinaIzdanja(1985);
        knjiga4.setIsbn("9780261102262");
        knjiga4.stampaj();


    }
}
