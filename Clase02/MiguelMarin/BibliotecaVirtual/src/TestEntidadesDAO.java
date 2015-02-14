
import rysi.monos.dao.TesisDAO;
import rysi.monos.entity.Tesis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miguel
 */
public class TestEntidadesDAO {
    
    public void main(String[] args)
    {
        TesisDAO tesisDao = new TesisDAO();
        Tesis tes= new Tesis();
        tes.setAnioTitulacion(2005);
        tes.setArchivoTesis("/rutaX/tesis.pdf");
        tes.setAutorTesis("Miguel Marin");
        tes.setCondicionSitio("Condicion del sitio");
        tes.setDirectorTesis("JUAN LOPEZ");
        Disciplina dis = new Disciplina();
        
        tes.setDisciplina(null);
        
        tesisDao.insert(tes);
    }
}
