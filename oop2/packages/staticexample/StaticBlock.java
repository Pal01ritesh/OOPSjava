package oop2.packages.staticexample;

public class StaticBlock {
    static int a = 5;
    static int b;

//    However, it's important to note that creating an instance of StaticBlock does not trigger
//    the execution of the static block again. The static block is executed only once, when the class is loaded.
    //this static block is only executed once in the whole program
    static {
        System.out.println("we are inside the static block");
        int b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
//      System.out.println(obj.a);

//      this statement is more prominant to use than the above statement as a static instance is being accessed it is
//        good to use the class name as the class belongs to all the objects.

        System.out.println(StaticBlock.a);

    }
}
