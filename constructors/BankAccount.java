package constructors;

import java.time.LocalDateTime;
import java.time.Month;

public class BankAccount {

    String name;
    LocalDateTime opened;
    double balance;

    // no argument constructor method

    public BankAccount() {
        this.name = "";
        this.opened = LocalDateTime.now();
        this.balance = 0.0d;
    }

    // parametized constructor
    public BankAccount(String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %f",
                this.name, this.opened.toString(), this.balance);
    }

    public static void main(String[] args) {
        LocalDateTime opened = LocalDateTime.of(2018, Month.JUNE, 29, 06, 30, 00);
        BankAccount account = new BankAccount("Tom", opened, 1000.0);
        System.out.println(account.toString());
    }

}
