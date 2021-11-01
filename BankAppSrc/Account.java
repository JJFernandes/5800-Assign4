public class Account {
    private AccountHolder holder;
    private double balance;

    public Account(AccountHolder holder, double amount){
        this.holder = holder;
        this.balance = amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
        else throw new Exception("Account balance insufficient for withdrawal of this amount");
    }

    public AccountHolder getHolder() {
        return holder;
    }

    public void setHolder(AccountHolder holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}
