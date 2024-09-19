package Exercicio1;

public class Holder {
    private String name;
    private int accounteNumber;
    private double balance;

    public Holder(String name, int accounteNumber, double balance) {
        this.name = name;
        this.accounteNumber = accounteNumber;
        this.balance = balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value;
    }

}
