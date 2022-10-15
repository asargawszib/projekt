package zadanie.lab01;


import zadanie.lab02.RodzajSmaku;

public class KoktajlTruskawkowy extends KoktajlSmakowy{

    private final RodzajTruskawki rodzajTruskawki;
    private final RodzajSmaku rodzajSmaku;

    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki,
            final RodzajSmaku rodzajSmaku
    ){
    super(kcal,rodzajSmaku.TRUSKAWKOWY);

    this.rodzajTruskawki = rodzajTruskawki;
    this.rodzajSmaku = rodzajSmaku.TRUSKAWKOWY;
    }

    @Override
    public void pij() {
        System.out.println("Pije koktajl o smaku "
                + rodzajSmaku.smak() + ", która cechuje się " + rodzajTruskawki.cecha()
        );
        String message = String.format("Pije koktaljt o smaku %s, która cechuje się %s",
                rodzajSmaku.smak(),
                rodzajTruskawki.cecha()
        );
        System.out.println(message);
    }

    @Override
    public RodzajSmaku smak() {

        return rodzajSmaku;
    }
}
