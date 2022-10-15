package zadanie.lab02;

import zadanie.lab01.KoktajlTruskawkowy;
import zadanie.lab01.RodzajTruskawki;

public class Application {

    public static void main(String[] args) {

        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA,
                RodzajSmaku.TRUSKAWKOWY
        );
        koktajlTruskawkowy.jedz();
        koktajlTruskawkowy.pij();
        koktajlTruskawkowy.smak();

    }

}
