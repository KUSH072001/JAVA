package Bank_details;

public class BankAccount {
    int CustomerId;
    String CustomerName;
    float Balance;
    String email;
    static  String BankName="sbi";

  float Deposit(float amountToBeDeposited){
      if(amountToBeDeposited>0){
        Balance+=amountToBeDeposited;

      }

      return Balance;
  }
}
