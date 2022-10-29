package pl.edu.wszib.lab1.zad1;

public abstract class KoktajSmakowy extends Koktaj implements Smakowalne {
    protected final RodzajSmaku rodzajSmaku;

    protected KoktajSmakowy(int kcal,
                            RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    protected int ZrodloSmaku() {

        return 0;
    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }

    public ZrodloSmaku zrodloSmaku() {
        //Tutaj switch statement
       final ZrodloSmaku zrodloSmaku = null;
       switch (rodzajSmaku){
           case TRUSKAWKOWY:
               return ZrodloSmaku.OWOCOWY;
           case BANANOWY:
               return ZrodloSmaku.OWOCOWY;
           case SZPINAKOWY:
               return ZrodloSmaku.WARZYWNY;
           case CIASTECZKOWY:
               return ZrodloSmaku.INNY;
           case JABLKOWY:
               return ZrodloSmaku.OWOCOWY;
       }
        return zrodloSmaku;
    }

//    public ZrodloSmaku zrodloSmaku() {
//        //Tutaj switch expression
//        return null;
//    }

}
