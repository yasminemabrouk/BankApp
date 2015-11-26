/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccont.presentation.util;

import javax.faces.context.FacesContext;

/**
 *
 * @author yasmine.mabrouk
 */
public class Tool {
    
    public static <T> T findBean(String m , Class<T> c){
    FacesContext context =FacesContext.getCurrentInstance();
    return c.cast(context.getApplication()
            .evaluateExpressionGet(context, "#{"+m+"}",c));
    }
    
    
}
