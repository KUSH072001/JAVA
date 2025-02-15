package Inheritance;

public class B extends A{
    static {
        System.out.println(" b class static block");
    }
    {
        System.out.println("b class instance block");
    }
    public B(){
        System.out.println("b class constructor");
    }
    public static void main(String[] args) {

//        what will be the order of execution

//        A a1=new A();
//a class static block
// b class static block
//a class instance block
//a class constructor

        B b1=new B();




    }
}
