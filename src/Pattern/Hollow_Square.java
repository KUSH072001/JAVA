package Pattern;



public class Hollow_Square {
    public static void main(String[] args) {
///1
//        12
//        123
//        1234
//        12345
//        1234
//        123
//        12
//        1

       for(int i=1;i<=5;i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(j);
           }
           System.out.println(" ");

           }
        for (int x = 3; x >= 1; x--) {
            for (int y = 1; y <=x; y++) {
                System.out.print(y);
            }
            System.out.println(" ");
        }
       }
}
