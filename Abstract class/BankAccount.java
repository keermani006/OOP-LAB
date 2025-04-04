abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount + ", Remaining Balance: $" + balance);
    }
}

public class AbstractClassExample4 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.withdraw(1200);

        BankAccount current = new CurrentAccount(2000);
        current.deposit(300);
        current.withdraw(2500);
    }
}
