package homework.chapter09.Q07;

import java.util.Date;
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private String dateCreated;

    public Account() {
        //  dateCreated = new Date();
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    void withdraw(double amount) {
        balance -= amount;
    }
    void deposit(double amount) {
        balance -= amount;
    }
    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    public String getDate() {
        return dateCreated.toString();
    }
    double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }
}
