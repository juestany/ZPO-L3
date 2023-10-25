import java.util.ArrayList;
public class Magazyn {
    public ArrayList<Produkt> listaProduktow;

    public Magazyn() {
        /**
         * Konstruktor
         */
        listaProduktow = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        /**
         * Metoda dodająca produkt będący implementacją interfejsu Produkt do listy.
         * @param produkt (Produkt)
         */
        listaProduktow.add(produkt);
    }

    public ArrayList<Produkt> pokazProdukty() {
        /**
         * Metoda przedstawiająca surowe produkty w liście.
         */
        return this.listaProduktow;
    }

    public void usunProdukt(int i) {
        /**
         * Metoda usuwająca produkt będący implementacją interfejsu Produkt do listy za pomocą indeksu.
         * @param i (int) indeks do usunięcia
         */
        listaProduktow.remove(i);
    }

    public Produkt pobierzProdukt(int i) {
        /**
         * Metoda zwracająca produkt będący implementacją interfejsu Produkt do listy.
         * @param i (int) indeks
         */
        return listaProduktow.get(i);
    }

    public void przedstawProdukty() {
        /**
         * Metoda przedstawiająca słownie produkty w liście wraz z ich
         * parametrami charakterystycznymi dla interfejsu Produkt.
         */
        if (listaProduktow == null || listaProduktow.isEmpty()) {
            System.out.println("Magazyn jest pusty.");
            return;
        }
        for (Produkt produkt : this.listaProduktow) {
            System.out.println(produkt);
            System.out.println("Nazwa produktu: " + produkt.pobierzNazwe());
            System.out.println("Cena produktu: " + produkt.pobierzCene());
            System.out.println("Ilość produktu: " + produkt.pobierzIlosc() + "\n");
        }
    }
}
