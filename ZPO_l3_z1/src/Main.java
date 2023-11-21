public class Main {
    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();
        Mleko laciate = new Mleko("Łaciate", 4.99, 1,3.5);
        Makaron jajeczny = new Makaron("Jajeczny", 6.99, 1, true);
        Ksiazka ksiazka = new Ksiazka("Potop", "nie pamiętam", 35.96, 1);

        magazyn.dodajProdukt(laciate);
        magazyn.dodajProdukt(jajeczny);
        magazyn.dodajProdukt(ksiazka);

        magazyn.przedstawProdukty();

        magazyn.usunProdukt("Jajeczny");
        magazyn.przedstawProdukty();
    }
}
