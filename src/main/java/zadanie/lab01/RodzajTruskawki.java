package zadanie.lab01;


/**
 * Rodzaje truskawek:
 * Ananasowa
 * Honeyoe
 * Polka
 * Kent
 * Christine
 */

public enum RodzajTruskawki {
    ANANASOWA("Białe owoce"),
    HONEYOE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie");

    private final String cecha;

    RodzajTruskawki(final String cecha){
        this.cecha = cecha;
    }

    public String cecha() {
        return cecha;
    }



}
