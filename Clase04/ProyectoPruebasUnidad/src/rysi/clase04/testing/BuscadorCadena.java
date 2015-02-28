package rysi.clase04.testing;

/**
 *
 * @author jaguilar
 */
public class BuscadorCadena {

    /**
     * Busca una cadena dentro de otra.
     * @param aguja Cadena a buscar.
     * @param pajar Cadena dentro de la cual se desea buscar.
     * @return true si la cadena aguja es una subcadena de pajar.
     * @throws NullPointerException si alguno de los parametros es null.
     */
    public boolean buscarCadena(String aguja, String pajar) {
        return (pajar.indexOf(aguja) != -1);
    }
    
    
    /**
     * Busca una cadena dentro de otra como subsecuencia, es decir, deben aparecer 
     * todos los caracteres de agujas en el mismo orden pero no necesariamente consecutivos.
     * @param agujas Caracteres a buscar.
     * @param pajar Cadena dentro de la cual se desea buscar.
     * @return true si la cadena aguja es una subcadena de pajar.
     * @throws NullPointerException si alguno de los parametros es null.
     */
    public boolean buscarCadenaComoSubsecuencia(String agujas, String pajar) {
        return false;
    }
}













