package pl.edu.wszib.lab1;

//import

import pl.edu.wszib.lab1.mypackage.MySecondClass;

public class Application {
    public static void main(String[] args) {
//        System.out.println("Hello Wolrd");
        MyFirstClass.myStaticField = "My static";
        MyFirstClass myFirstClass = new MyFirstClass();
        myFirstClass.firstField2 = "test";
        myFirstClass.run();

        MySecondClass mySecondClass = new MySecondClass();
        mySecondClass.run();

    }
}
