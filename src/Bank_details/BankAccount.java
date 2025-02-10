package Bank_details;

public class BankAccount {
    private int balance;  // Encapsulated variable (renamed Balance → balance)

    // Constructor to set initial balance
    public BankAccount(int initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be greater than 0");
        }
    }

    // Method to deposit money
    public void deposit(int amount) {  // Fixed spelling (Deposite → deposit)
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Amount must be greater than 0");
        }
    }

    // Method to withdraw money
    public int withdraw(int amount) {  // Fixed spelling (Widraw → withdraw)
        if (amount > 0 && balance >= amount) {  // Fixed withdrawal condition
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
        return checkBalance(); // Return updated balance
    }

    // Method to check balance
    public int checkBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    // Getter method for balance
    public int getBalance() { // Renamed getValue() → getBalance()
        return balance;
    }
}
