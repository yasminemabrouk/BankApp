/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccont.presentation.bean;

import ch.hearc.ig.odi.customeraccont.business.Customer;
import ch.hearc.ig.odi.customeraccont.business.Services;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author yasmine.mabrouk
 */
@SessionScoped
@Named(value="customercreateBean")
public class CustomercreateBean implements Serializable{

    @Inject
    private Services services;
    
    private Customer customer = new Customer()  ;

    public CustomercreateBean() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String addCustomer(){
        services.saveCustomer(customer.getNumber(),customer.getFirstName(),customer.getLastName());
        customer = new Customer();
        if (1==1 ){
            return "saveok";
        }else{
            return "error";
        }
    }
   
   
    
}
