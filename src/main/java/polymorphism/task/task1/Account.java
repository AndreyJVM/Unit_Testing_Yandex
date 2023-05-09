package polymorphism.task.task1;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void add(int money) {
        balance = balance + money;
    }

    public void add(double money){
        balance = balance + money;
    }

    public double getBalance() {
        return balance;
    }
}
