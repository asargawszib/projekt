package pl.edu.wszib.lab1.zad1;

public enum ZrodloSmaku {

    OWOCOWY("Owocowy"),
    WARZYWNY("Warzywny"),
    INNY("Inny"),
    ;

    private final String nazwa;
//    private final int poziom;

    ZrodloSmaku(String nazwa) {
        this.nazwa = nazwa;
//        this.poziom = poziom;
    }

    public String nazwa() {
        return nazwa;
    }

//    public int poziomSmaku() {
//        return poziom;
//    }

    @Override
    public String toString() {
        return "ZrodloSmaku{" +
                "nazwa='" + nazwa + '\'' +
//                ", poziom=" + poziom +
                '}';
    }
}
