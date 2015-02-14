package rysi.articulos.oad;

import java.util.List;
import rysi.articulos.entidades.Articulo;

/**
 * @author jaguilar
 * @version 1.0
 * @created 14-feb.-2015 11:39:55
 */
public class ArticulosOADJPA implements ArticulosOAD {

    public ArticulosOADJPA() {

    }

    /*
     * 
     * @param art
     */
    public void actualizar(Articulo art) {

    }

    /**
     *
     * @param art
     */
    public void borrar(Articulo art) {

    }

    /**
     *
     * @param idArticulo
     */
    public void borrar(int idArticulo) {

    }

    /**
     *
     * @param nombre
     */
    public List<Articulo> buscarPorNombre(String nombre) {
        return null;
    }

    /**
     *
     * @param art
     */
    public int crear(Articulo art) {
        return 0;
    }

    /**
     *
     * @param idArticulo
     */
    public Articulo getPorId(int idArticulo) {
        return null;
    }

    public List<Articulo> getTodos() {
        return null;
    }
}//end ArticulosOADJPA
