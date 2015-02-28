/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

/**
 *
 * @author miguel
 */
public class BuscadorCadena {
    
    /**
     * Busca una cadena dentro de la otra
     * @param aguja Cadena dentro de la cual se desea buscar
     * @param pajar
     * @return true si la cadena aguja es una subcadena de pajar 
     * @throws NullPointerException si alguno de los parametros es null
     */
    public boolean buscarCadena(String aguja,String pajar){
        if(pajar.indexOf(aguja) != -1){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    /**
     * Busca una cadena dentro de la otra como subsecuencia, es decir, deben aparecer
     * todos los caracteres de aguajas en el mismo orden pero no necesariamente consecutivos
     * @param aguja Cadena dentro de la cual se desea buscar
     * @param pajar
     * @return true si la cadena aguja es una subcadena de pajar 
     * @throws NullPointerException si alguno de los parametros es null
     */
    public boolean buscarCadenaComoSubsecuencia(String agujas,String pajar)
    {
        return false;
    }
    
}
