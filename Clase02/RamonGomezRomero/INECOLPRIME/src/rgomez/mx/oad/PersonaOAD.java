/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.oad;

import java.util.List;
import rgomez.mx.entidades.Persona;

/**
 *
 * @author Subli
 */
public interface PersonaOAD {
    
    public void actualizar(Persona per);

    public void borrar(Persona per);

    public List<Persona> buscarPorNombre(String nombre);

    public int crear(Persona per);

    public Persona getById(int idPersona);

    public List<Persona> getAll();
    
    public long getCountPersonas();
    
}
