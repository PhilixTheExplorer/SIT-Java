import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        double balance = sc.nextDouble();
        double annualInterestRate = sc.nextDouble();

        // Create an Account object with the specified details
        Account acc = new Account(id, balance, annualInterestRate);

        // Deposit funds
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);
        System.out.println("New Balance after deposit: " + acc.getBalance());

        // Withdraw funds
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);
        System.out.println("New Balance after withdrawal: " + acc.getBalance());

        // Display the balance, the monthly interest,
        // and the date when this account was created
        System.out.println("\nAccount Statement");
        System.out.println("------------------------");
        System.out.println("Account ID: " + acc.getId());
        System.out.printf("Balance: %.2f\n", acc.getBalance());
        System.out.printf("Monthly interest: %.2f\n",
                acc.getMonthlyInterest());
    }
}

class Account {
    // Write your code here
    private int id;
    private double balance;
    private static double annualInterestRate;

    // Constructor - DO NOT CHANGE HERE
    Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }

    Account(int newId, double newBalance, double newAnnualInterestRate) {
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;
    }

    // Write your code here
    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return (balance * (getMonthlyInterestRate()) / 100);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

}