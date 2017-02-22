/**
 * Created by fred on 1/28/2017.
 */
class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int a, double interest) {
        super(a);
        this.interest = interest;
    }

    public SavingsAccount(int a, double b, double interest) {
        super(a, b);
        this.interest = interest;
    }

    void addInterest() {
        this.bal = this.bal * (1.0 + interest);
    }

}
