/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

/**
 *
 * @author 74002612
 */
public class BuscadorCadenas {
    
    /**
     * Buscar una cadena dentro de otra.
     * @param aguja Cadena a Buscar.
     * @param pajal Cadena dentro de la cual se desea buscar.
     * @return true: Si la cadena aguja es una subcadena de pajar.
     * @throws NullPointerException si alguno de los parámetros es null.
     */
    public boolean getBuscarCadena(String aguja, String pajal){
        return (pajal.indexOf(aguja) != -1);        
    }
    /**
     * Buscar una cadena dentro de otra como subsecuencia, es decir, deben aparecer 
     * todos los carácteres de agujas en el mismo orden pero no necesariamente consecutivos.
     * @param agujas Cadena a Buscar.
     * @param pajal Cadena dentro de la cual se desea buscar.
     * @return true: Si la cadena aguja es una subcadena de pajar.
     * @throws NullPointerException si alguno de los parámetros es null.
     */
    public boolean GetBuscarCadenaComoSubsecuencia(String agujas, String pajar){                
        return false;
    }    
}
