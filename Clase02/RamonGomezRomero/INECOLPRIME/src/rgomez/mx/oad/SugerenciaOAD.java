/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.mx.oad;

import java.util.List;
import rgomez.mx.entidades.Sugerencia;

/**
 *
 * @author Subli
 */
public interface SugerenciaOAD {
    public void actualizar(Sugerencia sugerencia);

    public void borrar(Sugerencia sugerencia);

    public void borrar(int idSugerencia);

    public List<Sugerencia> buscarPorSugerencia(String sugerencia);

    public int crear(Sugerencia sugerencia);

    public Sugerencia getById(int idSugerencia);

    public List<Sugerencia> getAll();
    
    public long getCountSugerencias();
}
