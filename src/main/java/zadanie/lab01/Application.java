package zadanie.lab01;

import zadanie.lab02.RodzajSmaku;

public class Application {

    public static void main(String[] args) {

        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA,
                RodzajSmaku.CIASTECZKOWY
        );
        koktajlTruskawkowy.jedz();
        koktajlTruskawkowy.pij();
        koktajlTruskawkowy.smak();

    }

}
