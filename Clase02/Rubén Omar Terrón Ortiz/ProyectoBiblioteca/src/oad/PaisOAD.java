/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oad;

import java.util.List;
import proyectobiblioteca.Pais;

/**
 *
 * @author terron
 */
public interface PaisOAD {
    public abstract boolean crear(Pais p);
    public abstract boolean actualizar(Pais p);
    public abstract boolean eliminar(Pais p);
    public abstract Pais getPais(Integer idPais);
    public abstract List<Pais> buscarPorNombre(String nombre);
    public abstract long contar();
}
