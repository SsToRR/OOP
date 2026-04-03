package problem3;

public class Account {

    private double balance;
    private int accNumber;

    public Account(int accNumber) {
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if(sum <= balance) {
            balance -= sum;
        } else {
            System.out.println("Not enough balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if(balance >= amount) {
            withdraw(amount);
            other.deposit(amount);
        }
    }

    public String toString() {
        return "Account #" + accNumber + " Balance: " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}
