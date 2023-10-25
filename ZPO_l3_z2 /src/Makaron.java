public class Makaron extends Produkt {
    public double cena;
    public String nazwa;
    public double ilosc;
    public boolean czyPszenny;

    public Makaron (String nazwa, double cena, double ilosc, boolean czyPszenny) {
        /**
         * Konstruktor
         */
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
        this.czyPszenny = czyPszenny;
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

    public boolean pobierzCzyPszenny() {
        /**
         * Metoda zwracająca true, jeśli makaron jest pszenny, i false, jeśli inny.
         * @return czy jest pszenny? (boolean)
         */
        return this.czyPszenny;
    }
}
