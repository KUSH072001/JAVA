package Pattern;



public class Hollow_Square {
    public static void main(String[] args) {
//        hollow square pattern
//
//          *
//          **
//          ***
//          ****
//
//


       for(int i=1;i<=4;i++){
           for(int j=4;j>=i;j--){
              for(int k=1;k<=i;k++){
                  if(j==i) {
                      System.out.print("*");
                  }
              }

                  System.out.print(" ");
           }
           System.out.println(" ");

       }


    }
}