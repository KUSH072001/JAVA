package Task11;

public class Array {
        static int Student(int array[],int key){
            for(int i=0;i<=array.length;i++){
                if(array[i]==key){
                    return i;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
            int array[]={1,22,33,44,556,33,66};
        int index=Student(array,33);
        System.out.println(index    );
    }

}
