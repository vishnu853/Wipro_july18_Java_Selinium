package LabSession_July_24;

abstract class BankAccount 
{
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    // Method to print balance
    public void printBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private static final double intrest = 0.04;  

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest() {
        return balance * intrest;
    }
}


class FixedDepositAccount extends BankAccount {
    private static final double intrest2 = 0.065;  

    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

  
    public double calculateInterest() {
        return balance * intrest2;
    }
}


public class BankDemo {
    public static void main(String[] args)
    {
        
        BankAccount savings = new SavingsAccount("SAV123", 10000);
        savings.printBalance();
        System.out.println("Savings Interest: " + savings.calculateInterest());

        System.out.println();

        // Create a fixed deposit account
        BankAccount fixed = new FixedDepositAccount("FD456", 50000);
        fixed.printBalance();
        System.out.println("Fixed Deposit Interest: " + fixed.calculateInterest());
    }
}