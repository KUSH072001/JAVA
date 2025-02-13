package Task5;

import java.util.Scanner;

public class Area {
    int length,breadth;
    void setDim(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    int getArea(){
       return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Area a1=new Area();
        System.out.println("enter length");
        int length= sc.nextInt();
        System.out.println("enter breadth");
        int breadth=sc.nextInt();
        a1.setDim(length,breadth);
        System.out.println(a1.getArea());
    }
}
