import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("number1");
       int n1=sc.nextInt();
        System.out.println("number2");
       int n2=sc.nextInt();

       float Average=(n1+n2)/2f;
        System.out.println(Average);

        sc.close();

    }
}