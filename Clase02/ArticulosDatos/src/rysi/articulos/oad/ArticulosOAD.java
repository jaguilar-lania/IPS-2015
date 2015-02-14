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
    public void actualizar(Articulo art);

    /**
     *
     * @param art
     */
    public void borrar(Articulo art);

    /**
     *
     * @param idArticulo
     */
    public void borrar(int idArticulo);

    /**
     *
     * @param nombre
     */
    public List<Articulo> buscarPorNombre(String nombre);

    /**
     *
     * @param art
     */
    public int crear(Articulo art);

    /**
     *
     * @param idArticulo
     */
    public Articulo getPorId(int idArticulo);

    public List<Articulo> getTodos();
    
    public long getConteoArticulos();
}//end ArticulosOAD






