package d30_05_2022;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(15474, "Nikola", "Osnovne");
        Student student2 = new Student(15466, "Stanko Stankovvic", "Master");
        student1.dodaj(new Ispit("Biologija", 6, "Mirko Cvetkovic"));
        student1.dodaj(new Ispit("Geologija", 8, "Mirko Cvetkovic"));
        student2.dodaj(new Ispit("Hidrologija", 5, "Marko Ilic"));
        student2.dodaj(new Ispit("Meterologija", 8, "Stojan Novakovic"));

        student1.stampaj();
        System.out.println("Prosek: " + student1.prosek());
        student2.stampaj();
        System.out.println("Prosek: " + student2.prosek());

    }
}