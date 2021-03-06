/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccont.presentation.bean;

import ch.hearc.ig.odi.customeraccont.business.Account;
import ch.hearc.ig.odi.customeraccont.business.Customer;
import ch.hearc.ig.odi.customeraccont.business.Services;
import ch.hearc.ig.odi.customeraccont.presentation.util.Tool;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author yasmine.mabrouk
 */
@SessionScoped
@Named(value = "customerDetailsBean")
public class CustomerDetailsBean implements Serializable {

    @Inject
    Services service;

    private Customer customer = new Customer();

    public CustomerDetailsBean() {
    }

    public String detailsClient(Customer cust) {
        setCustomer(cust);
        return "Details";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

//    public String detailsAccount(Customer cust, Account compte) {
//        CompteDetailsBean b = Tool.findBean("compteDetailsBean", CompteDetailsBean.class);
//        b.setAccount(service.getCustomer(cust.getNumber()).getAccountByNumber(compte.getNumber()));
//
//        return "DetailsCompte";
//    }

}
