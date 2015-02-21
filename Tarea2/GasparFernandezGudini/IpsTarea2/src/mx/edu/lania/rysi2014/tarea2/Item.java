/*
 * Copyright(C) Gudini 2015
 */
package mx.edu.lania.rysi2014.tarea2;

/**
 *
 * @author Gudini
 */
public class Item {

    int value;
    
    public Item() {
        this.value = 0;
    }
    
    public Item(int value) {
        value = this.value;
    }
    
    public int addValue(int value){
        return value += this.value;
    }
    
    public int substractValue(int value){
        return value -= this.value;
    }
}
