/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.clase04.testing;

/**
 *
 * @author Frost
 */
public class BuscarCadena {
    /**
     * Buscar una cadena dentro de otra.
     * @param aguja Cadena a buscar.
     * @param pajar Cadena dentro de la cual se desea buscar.
     * @return true si la cadena aguja es una subcadena de pajar.
     * @throws NullPointerException si alguno de los parametros es null.
     */
    public boolean buscarCadena(String aguja, String pajar){
        if(pajar.contains(aguja)){
            return true;
        }
        return false;
    }
    
    public boolean buscarComoSubsecuencia(String aguja, String pajar){
        aguja = aguja.toLowerCase();
        pajar = pajar.toLowerCase();
        int sizeA = aguja.length();
        int lastpos = -1;
        System.out.println("aguja: "+aguja+" size: "+aguja.length());
        for(int i = 0;i<sizeA;i++){
            System.out.println("lastpos: "+lastpos);
            System.out.println(aguja.charAt(i) + " FIO: "+ pajar.indexOf(aguja.charAt(i)) + " LIO: "+ pajar.lastIndexOf(aguja.charAt(i)));
            if(pajar.indexOf(aguja.charAt(i)) < 0){
                System.out.println("false A");
                return false;
            }else{
                int indexOf = pajar.indexOf(aguja.charAt(i));
                int lastIndexOf = pajar.indexOf(aguja.charAt(i));
                if(lastpos < 0){
                    lastpos = indexOf;
                }else{
                    if(lastpos<=indexOf){
                        lastpos = indexOf;
                    }else if (lastpos<=lastIndexOf){
                       lastpos = lastIndexOf;
                    }else{
                         System.out.println("false B");
                         return false;
                    }
                }
            }
        }
        return true;
    }
}
