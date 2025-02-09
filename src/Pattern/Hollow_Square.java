package Pattern;

class Pattern{
    void method(int ttl_row, int ttl_col){
        for(int i=1;i<=ttl_row;i++){
            for(int j=1;j<=ttl_col;j++){
                if(i==1 || i== ttl_row || j==1 || j==ttl_col ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

public class Hollow_Square {
    public static void main(String[] args) {
//        hollow square pattern
//        ****
//        *  *
//        *  *
//        ****
//

Pattern p1=new Pattern();
p1.method(4,4);



    }
}