import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
    Scanner sc=new Scanner(System.in);


        System.out.println("enter pencil 1");
        float pencil=sc.nextFloat();
        System.out.println("enter pen");
        float pen=sc.nextFloat();
        System.out.println("enter item eraser");
        float eraser=sc.nextFloat();

        float pencilCost=10f;
        float penCost=15f;
        float eraserCost=5f;

        float bill=pencil*pencilCost+pen*penCost+eraser*eraserCost;
        float gst=bill*0.18f;
        float FinalBill=bill+gst;
        float TotalItem=pencil+pen+eraser;
        System.out.println("pen"+pen +" cost of per pen "+penCost);
        System.out.println("pencil"+pencil +" cost of per pencilCost "+pencilCost);
        System.out.println("eraser"+eraser +" cost of per eraser "+eraserCost);
        System.out.println("Total item are : "+TotalItem+"\n " );
        System.out.println("total bill "+ bill);
        System.out.println("total finalbill + 18% gst "+ FinalBill);
        sc.close();
    }
}