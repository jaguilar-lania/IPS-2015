/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoaDatos;


import clasePrimate.Tesis;
import java.util.List;

/**
 *
 * @author REBECA
 */
public interface TesisInt {
    public abstract boolean guardar (Tesis d);
    public abstract boolean eliminar (Tesis e);
    public abstract boolean actualizar (Tesis a);
    
    public abstract Tesis getPorId (int Id);
    public abstract List<Tesis> getTodos();
    
}
