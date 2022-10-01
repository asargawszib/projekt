package pl.edu.wszib.lab1;

public class MyFirstClass implements MyFirstInterface, MySecondInterface{

    public static String myStaticField;
    private String firstField;
     String firstField2;

    public void run(){
        System.out.println("firtsField = " + firstField);
        System.out.println("firtsField2 = " + firstField2);
    }

    @Override
    public void run1() {
        System.out.println("firtsField = " + firstField);
        System.out.println("firtsField2 = " + firstField2);
    }

    @Override
    public void run2() {
        System.out.println("firtsField = " + firstField);
        System.out.println("firtsField2 = " + firstField2);
    }
}