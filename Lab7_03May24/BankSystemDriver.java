import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class BankSystemDriver {

  public static void main(String[] args) {
    Bank krungthai = new Bank("KrungThai");
    Bank kasikorn = new Bank("Kasikorn");
    Account a1 = new Account(100001, "Ann Doe");
    Account a2 = new Account(100002, "John Wick", 1000);
    Account a3 = new Account(100003, "Mary Pink");
    Account a4 = new Account(100004, "Bean Hilton", 2000);

    HashMap<Integer, Account> accs = new HashMap<Integer, Account>();
    accs.put(1, a1);
    accs.put(2, a2);
    accs.put(3, a3);
    accs.put(4, a4);

    krungthai.addAccount(a1);
    krungthai.addAccount(a2);
    krungthai.addAccount(a4);
    kasikorn.addAccount(a3);
    krungthai.removeAccount(a1);
    kasikorn.addAccount(a1);
    a1.deposit(5000);
    a2.deposit(10000);
    a3.deposit(8000);
    a4.deposit(9000);
    a1.withdraw(300);
    a2.withdraw(500);
    a3.withdraw(100);
    a4.withdraw(1000);

    Transaction t1 = new Transaction("T01", "Shopping at Siam Center", 100);
    Transaction t2 = new Transaction("T02", "Creditcard", 500);
    Transaction t3 = new Transaction("T03", "Medical Treatment", 1000);
    Transaction t4 = new Transaction("T04", "Hotel De Lunar", 700);
    Transaction t5 = new Transaction("T05", "Central Online Shopping", 100);
    Transaction t6 = new Transaction("T06", "Debitcard", 500);
    Transaction t7 = new Transaction("T07", "Major Movie&Ceneplex", 1000);
    Transaction t8 = new Transaction(
      "T08",
      "Peach Beach Resort & Restaurant",
      700
    );

    HashMap<Integer, Transaction> trans = new HashMap<Integer, Transaction>();
    trans.put(1, t1);
    trans.put(2, t2);
    trans.put(3, t3);
    trans.put(4, t4);
    trans.put(5, t5);
    trans.put(6, t6);
    trans.put(7, t7);
    trans.put(8, t8);

    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 8; i++) {
      int temp = sc.nextInt();
      accs.get(temp).addTransaction(trans.get(i));
    }

    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      int ac1 = sc.nextInt();
      int ac2 = sc.nextInt();
      double amt = sc.nextDouble();
      accs.get(ac1).transfer(accs.get(ac2), amt);
    }

    for (int i = 0; i < 2; i++) {
      ArrayList<Account> accounts;
      if (i == 0) {
        accounts = krungthai.getAccounts();
        System.out.println("---" + krungthai.getName() + "---");
      } else {
        accounts = kasikorn.getAccounts();
        System.out.println("---" + kasikorn.getName() + "---");
      }
      Iterator<Account> itacc = accounts.iterator();
      while (itacc.hasNext()) {
        Account ac = itacc.next();
        System.out.println("Account ID: " + ac.getId());
        System.out.println("Account Name: " + ac.getName());
        System.out.println("Account Balance: " + ac.getBalance());
        ArrayList<Transaction> tr = ac.getTransactions();
        Iterator<Transaction> ittr = tr.iterator();
        while (ittr.hasNext()) {
          Transaction t = ittr.next();
          System.out.println("Transaction ID: " + t.getTransactionId());
          System.out.println("Transaction Description: " + t.getDescription());
          System.out.println("Transaction Amount: " + t.getAmount());
        }
      }
    }
  }
}

class Bank {

  private String name;
  private ArrayList<Account> accounts = new ArrayList<>();

  public Bank(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addAccount(Account ac) {
    accounts.add(ac);
  }

  public void removeAccount(Account ac) {
    accounts.remove(ac);
  }

  public ArrayList<Account> getAccounts() {
    return accounts;
  }
}

class Account {

  private int id;
  private String name;
  private double balance;
  private ArrayList<Transaction> transactions = new ArrayList<>();

  public Account(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Account(int id, String name, double balance) {
    this(id, name);
    this.balance = balance;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public ArrayList<Transaction> getTransactions() {
    return transactions;
  }

  public void addTransaction(Transaction t) {
    transactions.add(t);
    balance -= t.getAmount();
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void transfer(Account ac, double amount) {
    balance -= amount;
    ac.balance += amount;
  }
}

class Transaction {

  private String transactionId;
  private String description;
  private double amount;

  public Transaction(String transactionId, String description, double amount) {
    this.transactionId = transactionId;
    this.description = description;
    this.amount = amount;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public String getDescription() {
    return description;
  }

  public double getAmount() {
    return amount;
  }
}
