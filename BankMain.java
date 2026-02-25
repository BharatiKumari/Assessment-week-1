import java.util.*;

class BankAccount {
    // Private attributes (Data Hiding)
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method with basic validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method with balance check
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Getter method to check balance (Encapsulation)
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of BankAccount
        BankAccount myAccount = new BankAccount("SBI12345", 5000.0);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Performing operations
        System.out.print("\nEnter amount to deposit: ");
        double depAmt = sc.nextDouble();
        myAccount.deposit(depAmt);

        System.out.print("Enter amount to withdraw: ");
        double withAmt = sc.nextDouble();
        myAccount.withdraw(withAmt);

        System.out.println("\nFinal Balance: " + myAccount.getBalance());

        sc.close();
    }
}
