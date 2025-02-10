package Pattern;


class BankAccount{
    String userName;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}


public class Hollow_Square {
    public static void main(String[] args) {


BankAccount b1=new BankAccount();
        b1.userName="krishna";
        b1.setPassword("Radha");
        System.out.println(b1.getPassword());




    }
}
