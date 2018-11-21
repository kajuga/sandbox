package CSC_Miltithreading.multithreading2.demo4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private final Lock lock = new ReentrantLock();
    private final Condition balanceIncreased = lock.newCondition();

    private long balance;

    public Account() {
        this(0L);
    }

    Account(long balance) {
        this.balance = balance;
    }

    long getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }

    void deposit(long amount) {
        checkAmountNonNegative(amount);
        lock.lock();
        try {
            balance += amount;
            balanceIncreased.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(long amount) {
        checkAmountNonNegative(amount);
        lock.lock();
        try {
            if (balance < amount) {
                throw new IllegalArgumentException("not enough money");
            }
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }

    void waitAndWithdraw(long amount) throws InterruptedException {
        checkAmountNonNegative(amount);
        lock.lock();
        try {
            while (balance < amount) {
                balanceIncreased.await();
            }
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }

    private static void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }
}
