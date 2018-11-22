package CSC.multithreading.demo4;

public class Account {

    private long balance;

    public Account() {
        this(0L);
    }

    Account(long balance) {
        this.balance = balance;
    }

    synchronized long getBalance() {
        return balance;
    }

    synchronized void deposit(long amount) {
        checkAmountNonNegative(amount);
        balance += amount;
        notifyAll();
    }

    public synchronized void withdraw(long amount) {
        checkAmountNonNegative(amount);
        if (balance < amount) {
            throw new IllegalArgumentException("not enough money");
        }
        balance -= amount;
    }

    synchronized void waitAndWithdraw(long amount)
            throws InterruptedException {
        checkAmountNonNegative(amount );
        while (balance < amount) {
            System.out.println("Current balance: " + balance);
            wait();
        }
        balance -= amount;
    }

    private static void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }
}
