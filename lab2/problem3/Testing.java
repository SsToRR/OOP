package problem3;

public class Testing {

    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAcc s1 = new SavingsAcc(1, 5);
        CheckingAcc c1 = new CheckingAcc(2);

        s1.deposit(1000);
        c1.deposit(500);
        c1.withdraw(100);
        c1.withdraw(50);
        c1.withdraw(30);
        c1.withdraw(20);

        bank.openAccount(s1);
        bank.openAccount(c1);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println("After update:");
        bank.printAccounts();
    }
}
