package Pattern;



public class Hollow_Square {
    public static void main(String[] args) {
//*****
// ****
//  ***
//   **
//    *

        for( int i=1;i<=4;i++){
    for(int j=1;j<=i;j++){
       for(int k=4;k>=i;k--){
           if(i==j){
               System.out.print("*");
           }
       }
           System.out.print(" ");

    }
    System.out.println(" ");
}


    }
}