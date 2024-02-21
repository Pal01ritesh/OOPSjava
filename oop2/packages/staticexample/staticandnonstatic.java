package oop2.packages.staticexample;

public class staticandnonstatic {
    public static void main(String[] args) {
        fun1();

    }

//    static function is being created
//    non static functions cannot be called from this statio function
    static void fun1(){
//        fun2();
        //this will show error as a static function is being called from a non static function

//        to access a non static function from a static first we have to create an object of the function

        staticandnonstatic funn = new staticandnonstatic();
        funn.greeting();

    }

//    creating a non static function
    void fun2(){
       greeting();
    }


    void greeting(){
        System.out.println("hello from greeting function");
    }

}
