package Inheritance;

public class B extends A{
    int a=100;
    int b=200;
    int c=300;
    int d=400;


    void method1(){
        int a=10;
        int b=20;
        int c=30;
        int d=40;
//        we can access the instance method to super keyword
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println(super.c);
        System.out.println(super.d);
    }


    public static void main(String[] args) {
        B b1=new B();
        b1.method1();
    }
}
