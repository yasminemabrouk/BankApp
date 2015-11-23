/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccont.business;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author yasmine.mabrouk
 */
@SessionScoped
@Stateful
public class CustomercreateBean implements Serializable{

    @EJB
    private Services services;
    
    private Customer customer  ;

    public CustomercreateBean() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public void addCustomer(){
        services.saveCustomer(customer.getNumber(),customer.getFirstName(),customer.getLastName());
    }
   
   
    
}
