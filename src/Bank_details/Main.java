package Bank_details;

public class Main {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.Deposit(200.0f);
        System.out.println(b1.Balance);
        b1.Deposit(300);
        System.out.println(b1.Balance);
    }
}
