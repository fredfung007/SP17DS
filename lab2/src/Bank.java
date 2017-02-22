import java.util.ArrayList;
import java.util.List;

/**
 * Created by fredf on 1/31/2017.
 */
public class Bank {
    private List<Account> accountList;

    Bank() {
        this.accountList = new ArrayList<>();
    }

    public Account openAccount() {
        Account account = new Account(10000 + accountList.size());
        accountList.add(account);
        return account;
    }

    public CheckingAccount openChecking(double balance, double limit) {
        CheckingAccount account = new CheckingAccount(10000 + accountList.size(), balance, limit);
        accountList.add(account);
        return account;
    }

    public SavingsAccount openSavings (double balance, double interest) {
        SavingsAccount account = new SavingsAccount(10000 + accountList.size(), balance, interest);
        accountList.add(account);
        return account;
    }
    public void updateAll() {
        for (Account account : accountList) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckingAccount && account.bal < 0) {
                System.out.println("Account balance less than 0...");
            }
        }
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
