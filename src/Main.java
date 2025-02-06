import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        type conversion

        Scanner sc=new Scanner(System.in);
            float Average;
        System.out.println("Enter Number N1");
        int n1=sc.nextInt();
        System.out.println("Enter Number N2");
        int n2=sc.nextInt();

        Average=(n1+n2)/2f;
        System.out.println(Average);

    }
}