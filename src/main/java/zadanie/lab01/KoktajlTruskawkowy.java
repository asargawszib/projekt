package zadanie.lab01;

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne{

    @Override
    public void pij() {
        System.out.println("Pije koktaljt truskawkowy");

    }

    @Override
    public void smak() {
        System.out.println("Truskawkowy");
    }
}
