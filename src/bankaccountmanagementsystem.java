/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sowmya
 */
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int ac, double bal) {
        accountNumber = ac;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(double rate, int acc, double bal) {
        super(acc, bal);
        interestRate = rate;
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("After Interest: " + balance);
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(double limit, int acc, double bal) {
        super(acc, bal);
        overdraftLimit = limit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            if (balance < 0) {
                System.out.println("Overdraft Used: " + (-balance));
            }
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

class FDAccount extends BankAccount {
    int termInYears;
    double fdInterestRate;

    FDAccount(int term, double rate, int acc, double bal) {
        super(acc, bal);
        termInYears = term;
        fdInterestRate = rate;
    }

    void calculateMaturityAmount() {
        double maturity = balance + (balance * fdInterestRate * termInYears / 100);
        System.out.println("Maturity Amount (after " + termInYears + " years at " + fdInterestRate + "%): " + maturity);
    }
}

public class bankaccountmanagementsystem {
    public static void main(String[] args) {
        System.out.println("Savings Account");
        SavingsAccount ob1 = new SavingsAccount(5, 102345, 1000.0);
        ob1.displayBalance();
        ob1.addInterest();
        ob1.displayBalance();

        System.out.println("\nChecking Account");
        CheckingAccount ob2 = new CheckingAccount(1000.0, 102346, 2000.0);
        ob2.displayBalance();
        ob2.withdraw(2500.0);
        ob2.displayBalance();

        System.out.println("\nFD Account");
        FDAccount ob3 = new FDAccount(2, 6.0, 102347, 5000.0);
        ob3.displayBalance();
        ob3.calculateMaturityAmount();
    }
}
