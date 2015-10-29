package ch.hearc.ig.odi.customeraccont.app;

import ch.hearc.ig.odi.customeraccont.business.Account;
import ch.hearc.ig.odi.customeraccont.business.Customer;
import ch.hearc.ig.odi.customeraccont.business.Bank;

public class App {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        Bank bank = new Bank(1, "BlaserBank");
        bank.addCustomer(1, "Maël", "Blaser");
        bank.addCustomer(2, "Jean", "Pierre");
        bank.addAccount("1", "Courant", 0.001, bank.getCustomerByNumber(1));

        System.out.println("Customer 1, compte 1, balance : "
                + bank.getAccountByNumber("1").getBalance());
        System.out.println("**Customer 1, compte 1, credit 25");
        bank.getAccountByNumber("1").credit(25);
        System.out.println("**Customer 1, compte 1, debit 10");
        bank.getAccountByNumber("1").debit(10);
        System.out.println("Customer 1, compte 1, balance : " + bank.getAccountByNumber("1").getBalance());

        bank.addAccount("2", "Courant", 0.001, bank.getCustomerByNumber(2));
        System.out.println("**Customer 1, compte 1, transfert of 10 to Customer 2, compte 1");
        bank.getAccountByNumber("1").transfer(10, bank.getAccountByNumber("1"), bank.getAccountByNumber("2"));
        System.out.println("Customer 1, compte 1, balance : " + bank.getAccountByNumber("1").getBalance());
        System.out.println("Customer 2, compte 1, balance : " + bank.getAccountByNumber("2").getBalance());
        bank.addAccount("3", "Epargne", 0.002, bank.getCustomerByNumber(1));
        System.out.println("Customer 1, compte 2, balance : " + bank.getAccountByNumber("3").getBalance());
        System.out.println("**Customer 1, compte 1, transfert of 5 to Customer 1, compte 2");
        bank.getAccountByNumber("1").transfer(5, bank.getAccountByNumber("1"), bank.getAccountByNumber("3"));
        System.out.println("Customer 1, compte 1, balance : " + bank.getAccountByNumber("1").getBalance());
        System.out.println("Customer 1, compte 2, balance : " + bank.getAccountByNumber("3").getBalance());
        /*
         Customer customer1 = new Customer(1, "Maël", "Blaser");
         Customer customer2 = new Customer(2, "Jean", "Pierre");
         customer1.addAccount("1", "Courant", 0.001);
         System.out.println("Customer 1, compte 1, balance : " 
         + customer1.getAccountByNumber("1").getBalance());
         System.out.println("**Customer 1, compte 1, credit 25");
         customer1.getAccountByNumber("1").credit(25);
         System.out.println("**Customer 1, compte 1, debit 10");
         customer1.getAccountByNumber("1").debit(10);
         System.out.println("Customer 1, compte 1, balance : " + customer1.getAccountByNumber("1").getBalance());
         customer2.addAccount("1", "Courant", 0.001);
         System.out.println("**Customer 1, compte 1, transfert of 10 to Customer 2, compte 1");
         customer1.getAccountByNumber("1").transfer(10, customer1.getAccountByNumber("1"), customer2.getAccountByNumber("1"));
         System.out.println("Customer 1, compte 1, balance : " + customer1.getAccountByNumber("1").getBalance());
         System.out.println("Customer 2, compte 1, balance : " + customer2.getAccountByNumber("1").getBalance());
         customer1.addAccount("2", "Epagrne", 0.002);
         System.out.println("Customer 1, compte 2, balance : " + customer1.getAccountByNumber("2").getBalance());
         System.out.println("**Customer 1, compte 1, transfert of 5 to Customer 1, compte 2");
         customer1.getAccountByNumber("1").transfer(5, customer1.getAccountByNumber("1"), customer1.getAccountByNumber("2"));
         System.out.println("Customer 1, compte 1, balance : " + customer1.getAccountByNumber("1").getBalance());
         System.out.println("Customer 1, compte 2, balance : " + customer1.getAccountByNumber("2").getBalance());
         */
    }

}
