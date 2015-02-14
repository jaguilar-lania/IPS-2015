package rysi.articulos.oad;

import java.util.List;
import rysi.articulos.entidades.Articulo;

/**
 * @author jaguilar
 * @version 1.0
 * @created 14-feb.-2015 11:39:53
 */
public interface ArticulosOAD {

    /**
     *
     * @param art
     */
    public abstract void actualizar(Articulo art);

    /**
     *
     * @param art
     */
    public abstract void borrar(Articulo art);

    /**
     *
     * @param idArticulo
     */
    public abstract void borrar(int idArticulo);

    /**
     *
     * @param nombre
     */
    public abstract List<Articulo> buscarPorNombre(String nombre);

    /**
     *
     * @param art
     */
    public abstract int crear(Articulo art);

    /**
     *
     * @param idArticulo
     */
    public abstract Articulo getPorId(int idArticulo);

    public abstract List<Articulo> getTodos();
}//end ArticulosOAD
