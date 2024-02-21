package oop2.packages.staticexample;

public class Human {
    int age;
//  these variables are called as instance variables
    String name;
    int salary;
    boolean married;
// static is being used below as population attribute for each of the object is same and does not depend on any individual object
    static long population;


    public Human(int age, String name , int salary, boolean married){
        this.age = age;
        this.name= name;
        this.salary=salary;
        this.married=married;

//        it is more good to replace the "this" keyword used below with the class name as the attribute population is common
//        to all the objects created for the same class

//        this.population +=1;

        Human.population+=1;
    }
}
