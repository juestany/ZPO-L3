public class Ksiazka implements Produkt {
    public String nazwa;
    public String autor;
    public double cena;
    public double ilosc;

    public Ksiazka (String nazwa, String autor, double cena, double ilosc) {
        /**
         * Konstruktor
         */
        this.nazwa = nazwa;
        this.autor = autor;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    @Override
    public String pobierzNazwe() {
        /**
         * Metoda zwracająca nazwę produktu.
         * @return nazwa produktu
         */
        return this.nazwa;
    }

    @Override
    public double pobierzCene() {
        /**
         * Metoda zwracająca cenę produktu.
         * @return cena produktu (double)
         */
        return this.cena;
    }

    @Override
    public double pobierzIlosc() {
        /**
         * Metoda zwracająca ilość produktu.
         * @return ilość produktu (double)
         */
        return this.ilosc;
    }

    public String pobierzAutora() {
        /**
         * Metoda zwracająca autora książki.
         * @return autor książki (String)
         */
        return this.autor;
    }
}
