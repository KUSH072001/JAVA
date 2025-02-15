package Task12;

public class Hourse extends Animal{
    @Override
    void eat() {
        System.out.println("hourse eat");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("hourse will walk  leg");
    }
}
