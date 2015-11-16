package ch.hearc.ig.odi.customeraccont.business;

import javax.enterprise.context.RequestScoped;

@RequestScoped 
public class Account {

    private String number;
    private String name;
    private double balance = 0;
    private double rate = 0.001;
    private Customer customer;

    /**
     *
     * @param number
     * @param name
     * @param rate
     * @param customer
     */
    public Account(String number, String name, double rate, Customer customer) {
        this.number = number;
        this.name = name;
        this.rate = rate;
        this.customer = customer;
    }

    /**
     *
     * @param amount
     */
    public void credit(double amount) {
        balance = balance + amount;
    }

    /**
     *
     * @param amount
     */
    public void debit(double amount) {
        if (balance < amount) {
            throw new IllegalStateException();
        }
        balance = balance - amount;
    }

    /**
     *
     * @param amount
     * @param source
     * @param target
     */
    public static void transfer(double amount, Account source, Account target) {
        if (source.getBalance() < amount) {
            System.out.println(source.getBalance()+ "  "+ amount );
            throw new IllegalStateException();
        }
        source.debit(amount);
        target.credit(amount);
    }

    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return this.rate;
    }

    /**
     *
     * @param rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getNumber() {
        return this.number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

}
