package oop2.packages.staticexample;



//if we are doing classes inside classes then we cannot make outer classes as static
//only inner classes can be static or non-static
class Test{
    String name;

    public Test(String name){
        this.name=name;
    }
}


public class InnerClasses {
//    in this case the inner class test is dependent upon the outer class named "InnerClasses"
    static class Test{
        String name;

        public Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Ritesh");
        Test b = new Test("kunal");
    }
}
