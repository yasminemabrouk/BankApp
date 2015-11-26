/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccont.presentation.bean;

import ch.hearc.ig.odi.customeraccont.business.Account;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author yasmine.mabrouk
 */
@SessionScoped
@Named (value="compteDetailsBean")
public class CompteDetailsBean  implements Serializable{
    Account account = new Account();

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    }


