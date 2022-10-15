package zadanie.lab01;

import zadanie.lab02.RodzajSmaku;

public class KoktajlSmakowy extends Koktajl implements Smakowalne{

    protected KoktajlSmakowy(int kcal, RodzajSmaku rodzajSmaku) {
        super(kcal);
    }

    @Override
    public void pij() {

    }

    @Override
    public RodzajSmaku smak() {
        return null;
    }
}
