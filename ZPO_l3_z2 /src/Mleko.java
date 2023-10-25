public class Mleko extends Produkt {
    public double cena;
    public String nazwa;
    public double ilosc;
    public double zawTluszczu;

    public Mleko (String nazwa, double cena, double ilosc, double zawTluszczu) {
        /**
         * Konstruktor
         */
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
        this.zawTluszczu = zawTluszczu;
    }

    @Override
    public String pobierzNazwe() {
        /**
         * Metoda zwracająca nazwę produktu.
         * @return nazwa produktu (String)
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

    public double pobierzZawTluszczu() {
        /**
         * Metoda zwracająca zawartość tłuszczu mleka.
         * @return zawartość tłuszczu (double)
         */
        return this.zawTluszczu;
    }
}
