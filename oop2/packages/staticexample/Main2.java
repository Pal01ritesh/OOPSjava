package oop2.packages.staticexample;

public class Main2 {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();


        //   all 3 reference variables are pointing to the same object
    }
}
