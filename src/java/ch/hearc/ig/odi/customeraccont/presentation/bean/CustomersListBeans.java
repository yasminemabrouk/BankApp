package ch.hearc.ig.odi.customeraccont.presentation.bean;

import ch.hearc.ig.odi.customeraccont.business.Customer;
import ch.hearc.ig.odi.customeraccont.business.Services;
import ch.hearc.ig.odi.customeraccont.presentation.util.Tool;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasmine.mabrouk
 */
@RequestScoped 
@Named
public class CustomersListBeans implements Serializable {
    @Inject Services service ;
    public List<Customer> getCustomers(){
        return service.getCustomersList();
     
    }
    
}
