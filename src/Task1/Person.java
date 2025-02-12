package Task1;

public class Person {
  private String name;
  private int age;

  void setName(String name){
      this.name=name;
  }
  String getName(){
     return name;
  }
  void setAge(int age){
      if(age>0){
        this.age=age;
      }else {
          System.out.println("invalid input");
      }

  }
  int getAge(){


      return age;

  }

    public static void main(String[] args) {

      Person p1=new Person();
      p1.setName("kra");
      p1.setAge(12);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
