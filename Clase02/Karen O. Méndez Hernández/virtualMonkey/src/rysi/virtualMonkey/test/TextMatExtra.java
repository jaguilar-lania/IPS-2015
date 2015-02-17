package rysi.virtualMonkey.test;

import rysi.virtualMonkey.entidades.Materialextra;
import rysi.virtualMonkey.oad.OADMatExtra;
import rysi.virtualMonkey.oad.OADJPAMatExtra;

/**
 *
 * @author kmendez 
 */
public class TextMatExtra {
    public static void main(String[] args) {
        Materialextra mat = new Materialextra();
        mat.setIdmaterialextra(1);
        mat.setTitulo("Karen");
        mat.setIdtesis(2);
        

        OADMatExtra artsOAD = new OADJPAMatExtra();
        artsOAD.registrar(mat);
        
        System.out.println(String.format("InserccionCorrecta")); 

            
        
                       
                }
}







