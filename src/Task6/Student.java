package Task6;

import java.util.Scanner;

public class Student {
    Scanner sc=new Scanner(System.in);
    String name;
    int roll_No;
   void setValues(){
       System.out.println("enter name");
       this.name=sc.nextLine();
       System.out.println("enter roll no");
       this.roll_No=sc.nextInt();
       Display();
   }
   String getName(){
       return name;
   }
   int getRollNo(){
       return roll_No;
   }
   void setUpdateValues(){
       System.out.println("enter name");
       this.name=sc.next();
       System.out.println("enter roll number");
       this.roll_No=sc.nextInt();
       System.out.println("value is updated");
   }
   void Display(){
       Scanner sc=new Scanner(System.in);
       System.out.println(getName());
       System.out.println(getRollNo());
       System.out.println("you want to update values");
      String Option=sc.nextLine();
       if(Option.equals("yes")){
           setUpdateValues();

       }else {
           System.out.println("stop");
       }
   }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setValues();

    }
}
