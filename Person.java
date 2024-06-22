class BankAccount {
    protected double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful");
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double rate) {
        interestRate = rate;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        balance *= (1 + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -100;

    public CheckingAccount() {
        super();
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (balance < 0 && balance > OVERDRAFT_LIMIT) {
            System.out.println("Warning: Overdraft");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a savings account with a 2% interest rate
        SavingsAccount savingsAccount = new SavingsAccount(0.02);

        // Deposit $100 into the savings account
        savingsAccount.deposit(100);

        // Display the balance of the savings account
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        // Create a checking account
        CheckingAccount checkingAccount = new CheckingAccount();

        // Deposit $50 into the checking account
        checkingAccount.deposit(50);

        // Display the balance of the checking account
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }
}