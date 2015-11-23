package ch.hearc.ig.odi.customeraccont.business;

import java.util.ArrayList;

public class Customer {

    private int number;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */
    
    public Customer() {
    }

    public Customer(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @param number
     */
    public Account getAccountByNumber(String number) {
        int i = 0;
        Account account = null;
        while (i < accounts.size() - 1 || account == null) {
            if (accounts.get(i).getNumber() == number) {
                account = accounts.get(i);
            }
            i++;
        }
        return account;
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     */
    public void addAccount(String number, String name, double rate) {
        Account account = new Account(number, name, rate, this);
        accounts.add(account);
    }

    public String getFirstName() {
        return this.firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return this.number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

}
