package Package2;

class Animal{
    protected void m1(){
        System.out.println("Animal");
    }
    static  void m2(){
        System.out.println("this is a second method");
    }
}
public class b extends Animal{
    public void method1(){
        System.out.println("method 1 in package 2");
       Animal a1=new b();
        a1.m1();
        Animal.m2();
    }
}
