/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoaDatos;

import clasePrimate.Disciplina;
import java.util.List;

/**
 *
 * @author REBECA
 */
public interface DisciplinaInt {
    public abstract boolean guardar (Disciplina d);
    public abstract boolean eliminar (Disciplina e);
    public abstract boolean actualizar (Disciplina a);
    
    public abstract Disciplina getPorId (int Id);
    public abstract List<Disciplina> getTodos();
}
