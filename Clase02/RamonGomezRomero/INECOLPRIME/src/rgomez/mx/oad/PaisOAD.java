/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.oad;

import java.util.List;
import rgomez.mx.entidades.Pais;

/**
 *
 * @author Subli
 */
public interface PaisOAD {
    
    public void actualizar(Pais pais);

    public void borrar(Pais pais);

    public List<Pais> buscarPorNombre(String nombrePais);

    public int crear(Pais pais);

    public Pais getById(int idPais);

    public List<Pais> getAll();
    
    public long getCountPais();
    
}
