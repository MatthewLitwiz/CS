package More;

class BankAccount {
    String accountNumber;
    double balance;

    // Constructor with parameters
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        // Create BankAccount objects using constructors
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 500.0);

        // Deposit and withdraw
        account1.deposit(200.0);
        account2.withdraw(100.0);

        // Display account balances
        account1.displayBalance();
        account2.displayBalance();
    }
}