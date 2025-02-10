package Pattern;



public class Hollow_Square {
    public static void main(String[] args) {
///
//1    1
//23
//456
//78910
    int k=1;
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(k);
            k++;
        }
        System.out.println(" ");
    }
    }
}
