package Task13;

public class Main extends Child {
    public static void main(String[] args) {
        Parent p1= new Child();
        p1.m1();
        System.out.println(p1.name);
    }
}
