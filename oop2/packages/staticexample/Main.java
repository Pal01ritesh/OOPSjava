package oop2.packages.staticexample;

import static oop2.packages.staticexample.Human.population;

public class Main {
    public static void main(String[] args) {
        Human rishabh = new Human(16, "Rishabh", 1000000, false);
        Human rahul = new Human(34,"rahul",15000,true);



        System.out.println(rishabh.population);
        System.out.println(rahul.population);

    }
}
