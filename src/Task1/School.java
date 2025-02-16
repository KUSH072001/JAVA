package Task1;



public class School {
    String name="john";

    public School(){
        int id=1234; //local variable

    }
    public void mySchool(){
        String schoolName="MMCC";//local variable
    }

    public static void main(String[] args) {
        School s1=new School();
        System.out.println(s1.name);
        s1.mySchool();

    }

}
