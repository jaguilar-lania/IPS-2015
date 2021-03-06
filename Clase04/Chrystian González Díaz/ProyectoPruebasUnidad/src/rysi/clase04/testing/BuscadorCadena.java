/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

/**
 *
 * @author Chrys
 */
public class BuscadorCadena {
    
    /**
     * Busca una cadena dentro de otra.
     * @param aguja Cadena a buscar.
     * @param pajar Cadena dentro de la cual se desea buscar.
     * @return true si la cadena aguja es una subcadena de pajar.
     * @throws NullPointerException si alguno de los parametros es Null.
    **/
    public boolean buscarCadena(String aguja, String pajar){
        
        return (pajar.indexOf(aguja) != -1);
        
    }
    
    
    /**
     * Busca una cadena dentro de otra como subsecuencia, es decir, deben aparecer
     * todos los caracteres de agujas en el mismo orden pero no necesariamente consecutivos.
     * @param aguja Cadena a buscar.
     * @param pajar Cadena dentro de la cual se desea buscar.
     * @return true si la cadena aguja es una subcadena de pajar.
     * @throws NullPointerException si alguno de los parametros es Null.
    **/
    
    public boolean buscarCadenaComoSubsecuencia(String aguja, String Pajar){
        return false;
    }
    
}
