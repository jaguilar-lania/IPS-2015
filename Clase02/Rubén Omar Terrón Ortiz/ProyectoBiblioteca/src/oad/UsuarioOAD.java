/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oad;

import java.util.List;
import proyectobiblioteca.Usuario;

/**
 *
 * @author terron
 */
public interface UsuarioOAD {
    public abstract boolean crear(Usuario u);
    public abstract boolean actualizar(Usuario u);
    public abstract boolean eliminar(Usuario u);
    public abstract Usuario getUsuario(Integer idUsuario);
    public abstract List<Usuario> buscarPorNombre(String nombre);
    public abstract long contar();
}
