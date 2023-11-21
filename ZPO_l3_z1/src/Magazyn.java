import java.util.*;
public class Magazyn {
    public Map<String, Produkt> listaProduktow;

    public Magazyn () {
        listaProduktow = new HashMap<>();
    }
    public void dodajProdukt(Produkt produkt) {
        /**
         * Metoda dodająca produkt będący implementacją interfejsu Produkt do mapy.
         * @param produkt (Produkt)
         */
        listaProduktow.put(produkt.pobierzNazwe(), produkt);
    }

    public void pokazProdukty() {
        /**
         * Metoda przedstawiająca produkty w mapie jako nazwa produktu: produkt.
         */
        for (Map.Entry<String, Produkt> para_produkt : listaProduktow.entrySet()) {

            System.out.print(para_produkt.getKey() + ":");
            System.out.println(para_produkt.getValue());
        }
    }

    public void usunProdukt(String nazwa) {
        /**
         * Metoda usuwająca produkt będący implementacją interfejsu Produkt do listy za pomocą klucza.
         * @param nazwa (String) klucz produktu (nazwa) do usunięcia
         */
        listaProduktow.remove(nazwa);
    }

    public Produkt pobierzProdukt(String nazwa) {
        /**
         * Metoda zwracająca produkt będący implementacją interfejsu Produkt do listy.
         * @param nazwa (String) klucz produktu
         */
        return listaProduktow.get(nazwa);
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
        for (Map.Entry<String, Produkt> entry : listaProduktow.entrySet()) {
            Produkt produkt = entry.getValue();

            System.out.println("Nazwa produktu: " + entry.getKey());
            System.out.println("Cena produktu: " + produkt.pobierzCene());
            System.out.println("Ilość produktu: " + produkt.pobierzIlosc() + "\n");
        }
    }
}
