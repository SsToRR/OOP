package problem3;

import java.util.Vector;

public class Bank {

    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(Account acc) {
        accounts.remove(acc);
    }

    public void update() {

        for(Account acc : accounts) {

            if(acc instanceof SavingsAcc) {
                ((SavingsAcc) acc).addInterest();
            }

            if(acc instanceof CheckingAcc) {
                ((CheckingAcc) acc).deductFee();
            }
        }
    }

    public void printAccounts() {
        for(Account acc : accounts) {
            acc.print();
        }
    }
}
