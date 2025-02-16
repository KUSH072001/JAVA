package Task1;



public class School {
    String name="john";

    public School(){
        int id=1234;
    }
    public void mySchool(){
        String schoolName="MMCC";
    }

    public static void main(String[] args) {
        School s1=new School();
        System.out.println(s1.name);
        s1.mySchool();

    }

}
