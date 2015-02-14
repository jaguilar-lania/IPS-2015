
import java.util.Date;
import rysi.monos.dao.*;
import rysi.monos.entity.*;

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
    
    public static void main(String[] args)
    {
        TesisDAO tesisDao = new TesisDAO();
        Tesis tes= new Tesis();
        tes.setAnioTitulacion(2005);
        tes.setArchivoTesis("/rutaX/tesis.pdf");
        tes.setAutorTesis("Miguel Marin");
        tes.setCondicionSitio("Condicion del sitio");
        tes.setDirectorTesis("JUAN LOPEZ");
        tes.setEstatus(1);
        tes.setFechaReg(new Date());
        tes.setGradoObtenido(1);//licenciatura
        tes.setIdestado(0);
        tes.setTitulo("MONOS ACROBATICOS");
        Disciplina dis= new Disciplina();
        dis.setDisciplina("MONOS AULLADORES");
        DisciplinaDAO discDAO = new DisciplinaDAO();
        discDAO.insert(dis);
//        Disciplina dis = new Disciplina();
//        dis.setDisciplina("MONOS ESOTERICOS");
//        
        //tes.setDisciplina(tes);
        
        tesisDao.insert(tes);
    }
}
