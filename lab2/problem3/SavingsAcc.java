package problem3;

public class SavingsAcc extends Account {

    private double interestRate;

    public SavingsAcc(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "Savings " + super.toString() + " Interest rate: " + interestRate + "%";
    }
}
