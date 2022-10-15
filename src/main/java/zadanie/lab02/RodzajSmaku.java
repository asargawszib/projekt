package zadanie.lab02;

/**
 * Zadanie:
 * Utwórz enum RodzajSmaku zawierający wartości:
 * Troskawkowy
 * Bananowy
 * Szpinakowy
 * Ciasteczkowy
 * Jabłkowy
 * enum powinien przechowywać dodatkowo informację o poziomie słodkości
 * (int (albo enum jak ktoś bardzo chce),
 * poziomy do ustalenia według indywidualnych preferencji)
 *
 * A następnie zmodyfikować interfejs Smakowy
 * tak aby zwracał rodzaj smaku i dostosować resztę programu
 *
 */

public enum RodzajSmaku {

    TRUSKAWKOWY("Bardzo bardzo słodki"),
    BANANOWY("Słodki"),
    SZPINAKOWY("Mało słodki"),
    CIASTECZKOWY("Najsłodszy"),
    JABŁKOWY("Bardzo słodki");

    private final String smak;

    RodzajSmaku(final String smak){
        this.smak = smak;
    }

    public String smak() {
        return smak;
    }

}
