package ch.hearc.ig.odi.customeraccont.business;

import java.util.*;
import java.util.Map;
import javax.inject.Inject;
public class Bank {
    
@Inject Services service ;

    List<Account> accounts;
    List<Customer> customers;
    private int number;
    private String name;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param number
     * @param name
     */
    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

//    public List<Customer> getCustomers() {
//        return service.getCustomersList();
//    }
    
    

    public Map<Integer,Customer> getCustomers() {
        Map<Integer,Customer> map = new HashMap<Integer,Customer>();
        Integer i = 0;
        for (Customer c : service.getCustomersList() ){
        map.put(i,c);
        i = i + 1;
        }
        return map;
    }

    /**
     *
     * @param number
     */
    public Account getAccountByNumber(String number) {
        Account accountFinal = null;
        Iterator<Account> accountsIterator = accounts.iterator();
        while (accountsIterator.hasNext()) {
            Account accountTemp = accountsIterator.next();
            if (accountTemp.getNumber() == number) {
                accountFinal = accountTemp;
            }
        }
        return accountFinal;
    }

    /**
     *
     * @param number
     */
    public Customer getCustomerByNumber(int number) {
        Customer customerFinal = null;
        Iterator<Customer> customerIterator = customers.iterator();
        while (customerIterator.hasNext()) {
            Customer customerTemp = customerIterator.next();
            if (customerTemp.getNumber() == number) {
                customerFinal = customerTemp;
            }
        }
        return customerFinal;
    }

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     * @return  cust
     */
    public  Customer addCustomer(int number, String firstName, String lastName) {
        Customer cust = new Customer(number, firstName, lastName);
        this.customers.add(cust);
        return cust ;
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     * @param customer
     */
    public void addAccount(String number, String name, double rate, Customer customer) {
        if (customers.contains(customer)) {
            this.accounts.add(new Account(number, name, rate, customer));
        }
    }
}
