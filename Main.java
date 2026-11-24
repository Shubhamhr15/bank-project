class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ACC1001", "Aarav Sharma", 15000.00);
        BankAccount account2 = new BankAccount("ACC1002", "Priya Nair", 8000.00);

        account1.deposit(5000.00);
        account1.withdraw(3500.00);
        account1.checkBalance();

        account2.deposit(2500.00);
        account2.withdraw(12000.00);
        account2.withdraw(4000.00);
        account2.checkBalance();

        account1.displayDetails();
        account2.displayDetails();
    }
}