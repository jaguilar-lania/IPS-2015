/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoaDatos;


import clasePrimate.Especieprimate;
import java.util.List;

/**
 *
 * @author REBECA
 */
public interface PrimatesInt {
    public abstract boolean guardar (Especieprimate d);
    public abstract boolean eliminar (Especieprimate e);
    public abstract boolean actualizar (Especieprimate a); 
    public abstract Especieprimate getPorId (int Id);
    public abstract List<Especieprimate> getTodos();
    
}
