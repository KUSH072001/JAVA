package Task7;

public class Triangle {
    int a,b,c;
    void setValue(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("perimeter of triangle is "+perimeterOfTriangle());
    }
    int perimeterOfTriangle(){
        return a+b+c;
    }
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.setValue(12,2,3);

    }
}
