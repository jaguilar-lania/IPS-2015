/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.oad;

import java.util.List;
import rgomez.mx.entidades.Entidadfederativa;

/**
 *
 * @author Subli
 */
public interface EntidadFederativaOAD {
    
    public void actualizar(Entidadfederativa ef);

    public void borrar(Entidadfederativa ef);

    public List<Entidadfederativa> buscarPorNombre(String nombreEntidad);

    public int crear(Entidadfederativa ef);

    public Entidadfederativa getById(int idEntidadFederativa);

    public List<Entidadfederativa> getAll();
    
    public long getCountEntidades();
    
}
