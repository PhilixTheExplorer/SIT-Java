# AccountDriver

![account](../../img/account-oop.png)

Write a Java class named Account. The class contains:

Attributes (or Data Fields)
A private int attribute named “id” for the account.
A private double attribute named “balance” for the account.
A private double attribute named “annualInterestRate” that stores the current interest rate.
Methods
The accessor and mutator methods for id, balance, and annualInterestRate.
A method named getMonthlyInterestRate() that returns the monthly interest rate.
A method named getMonthlyInterest() that returns the monthly interest.
A method named withdraw that withdraws a specified amount from the account.
A method named deposit that deposits a specified amount to the account.
Note: Accessor methods, also known as “getter methods”, are methods that allow you to retrieve the value of an object’s private instance variables. Mutator methods, also known as “setter methods”, are methods that allow you to modify the value of an object’s private instance variables.

Additionally, the program includes a AccountDriver class, which is a driver class. DO NOT modify the AccountDriver class, as doing so may result in failure of your code. Your task is to write the code for the Account class, which must be the only public class in this program.

## For example

| **Input**     | **Result** |
|:--------------|:-----------|
| ex | ex |

```java
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
    
}
```
