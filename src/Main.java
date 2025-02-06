import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        Write a Java program to get a number from the user and print whether it is
//        positive or negative.

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
                if(number>0){
                    System.out.println(number+" number is positive");
                } else if (number<0) {
                    System.out.println(number+" number is negative");
                }
    }
}