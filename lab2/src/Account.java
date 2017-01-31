class Account {

    double bal;
    int accountNum;

    Account(int a) {
        bal = 0.0;
        accountNum = a;
    }

    public Account(int a, double b) {
        bal = b;
        accountNum = a;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            bal += sum;
            System.out.println("Deposit Successful ..");
        } else {
            System.err.println("cannot deposit negative amount.");
        }
    }

    public void withdraw(double sum) {
        if (sum > 0) {
            bal = bal - sum;
            System.out.println("Withdrawl Successful ..");
        } else
            System.err.println("cannot withdraw negative amount.");
    }

    public double getBalance() {
        return bal;
    }

    public int getAccountNumber() {
        return accountNum;
    }

    public String print() {
        return "Account " + accountNum + ": " + "balance = " + bal;
    }
}
