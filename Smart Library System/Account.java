class Account {

    int accountNumber;
    double balance;

    static String bankName = "National Bank";

    // Constructor
    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to calculate interest
    double calculateInterest() {
        return 0;
    }

    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // 4% interest
    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {

    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // 2% interest
    @Override
    double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankApp {

    public static void main(String[] args) {

        // Polymorphism using parent reference
        Account a1 = new SavingsAccount(101, 10000);
        Account a2 = new CurrentAccount(102, 10000);

        a1.display();
        System.out.println("Interest: ₹" + a1.calculateInterest());

        System.out.println();

        a2.display();
        System.out.println("Interest: ₹" + a2.calculateInterest());
    }
}