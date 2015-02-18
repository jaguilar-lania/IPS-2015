/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.mx.ips2015;

import java.math.BigDecimal;

/**
 *
 * @author miguel
 */
public class Item {
    
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public Item(){
       
        this.value = 0;
    }
    
}
