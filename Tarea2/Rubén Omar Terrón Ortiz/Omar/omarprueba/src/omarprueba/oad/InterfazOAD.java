/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omarprueba.oad;

/**
 *
 * @author rterr_000
 */
public interface InterfazOAD {
  public abstract boolean crear(Object o);
  public abstract boolean actualizar(Object o);
  public abstract boolean eliminar(Object o);
  public abstract Object leer(int id);
}
