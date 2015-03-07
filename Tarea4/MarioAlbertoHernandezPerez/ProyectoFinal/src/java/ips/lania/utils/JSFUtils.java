/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ips.lania.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Frost
 */
public class JSFUtils {
    public static void showGlowMessage(String header,String message){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(header, message));
    }
}
