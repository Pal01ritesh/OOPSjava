package oop1;

public class Intro {
    public static void main(String[] args) {
        Student kunal = new Student(13, "kunal", 13.2f);
//      System.out.println(kunal);

        kunal.roll = 13;
        kunal.name = "kunal kushwaha";
        kunal.marks = 88.5f;
//        kunal.male=true;

        System.out.println(kunal.roll);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
//        System.out.println(kunal.male);


        //calling a constructor with another constructor
//        Student random2 =  new Student();

    }

    static class Student{
        int roll;
        String name;
        float marks = 90f;
    //    boolean male;


        Student(int roll, String name , float marks){
            this.marks = roll;
            this.name= name;
            this.marks=marks;
        }

    }
}
