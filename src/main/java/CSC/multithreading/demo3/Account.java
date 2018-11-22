package CSC.multithreading.demo3;

public class Account {

    private long balance;

    public Account() {
        this(0L);
    }

    Account(long balance) {
        this.balance = balance;
    }

    long getBalance() {
        return balance;
    }

    public synchronized void deposit(long amount) {
        checkAmountNonNegative(amount);
//        synchronized (this) {
            balance += amount;
//        }
    }

    public synchronized void withdraw(long amount) {
        checkAmountNonNegative(amount);
//        synchronized (this) {
            if (balance < amount) {
                throw new IllegalArgumentException("not enough money");
            }
            balance -= amount;
//        }
    }

    private static void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }
}
