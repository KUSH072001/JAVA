import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//     Question 3 : Write a Java program to input week number(1-7) and print day of week name
//using switch case.
        Scanner sc=new Scanner(System.in);

    int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("monday");
            break;
            case 2:
                System.out.println("tuesday");
            break;
            case 3:
                System.out.println("thirsday");
                break;
            case  4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sunday");
            default:
                System.out.println("invalid input");

        }

    }
}