/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.ordenes.entidades;

/**
 *
 * @author Anny
 */
public class Item {
    private Integer value;
    
    //constructor
    
    public Item (){

}
    
    public Item(Integer valor){
    value=valor;
    }

public Integer getValue(){
    return value;
}
public void setValue(Integer valor){
    value = valor;
}


}

