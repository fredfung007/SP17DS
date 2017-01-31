/**
 * Created by fred on 1/28/2017.
 */
class CheckingAccount extends Account {
    private double overdraftLimit;
    CheckingAccount(int a, double overdraftLimit){
        super(a);
        this.overdraftLimit = overdraftLimit;
    }

    CheckingAccount(int a, double b, double overdraftLimit){
        super(a,b);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double sum) {
        if (sum > 0) {
            if (bal-sum > overdraftLimit) {
                bal = bal - sum;
                System.out.println("Withdraw Successful ..");
            } else {
                System.err.println("Overdraft Limit execeeded.");
            }
        } else
            System.err.println("cannot withdraw negative amount.");
    }
}
