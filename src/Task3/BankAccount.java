package Task3;

import java.util.Scanner;

public class BankAccount {
  private  String accountNumber;
  private double balance;

        public BankAccount(String AccountNo ,double balance){

            this.accountNumber=AccountNo;
            if(balance>=0){
                this.balance=balance;
            }else {
                System.out.println("invalid initial balance");
                this.balance=0;
            }
        }
        void Deposit(double amount){
                if(amount>0){
                    this.balance+=amount;
                    System.out.println("Deposited Amount "+amount );
                }else{
                    System.out.println("invalid deposit amount. amount should grater then 0");
                }
        }
        void Withdraw(double amount){
            if(this.balance>=amount){
                this.balance-=amount;
                System.out.println("Amount successfully withdraw "+ amount);
            }else {
                System.out.println("your account balance will be insufficient");
            }

        }
        void Display(){

                System.out.println("A/C no is "+this.accountNumber);
                System.out.println("Total Balance is "+ this.balance);


        }
    public static void main(String[] args) {
            BankAccount b1=new BankAccount("12345678",0);
            b1.Deposit(2334.12);
            b1.Display();
        }
}
