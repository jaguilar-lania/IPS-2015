
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
        DisciplinaDAO discDAO = new DisciplinaDAO();
//        Disciplina dis= new Disciplina();
//        dis.setDisciplina("MONOS GORILA7");
//        discDAO.insert(dis);
//        
//        
        SubdisciplinaDAO subDiscDAO = new SubdisciplinaDAO();
//        Subdisciplina subDis= new Subdisciplina();
//        subDis.setNombre("DISCIPLINA Y");
//        subDiscDAO.insert(subDis);
        
        InstitucionAdscripcionDAO instiDAO = new InstitucionAdscripcionDAO();
        InstitucionAdscripcion institucion= new InstitucionAdscripcion();
        institucion.setNombre("INSTITUCION Y");
        instiDAO.insert(institucion);
        
        EstadoDAO estadoDao = new EstadoDAO();
        Estado estado = new Estado();
        estado.setNombre("VERACRUZ");
        estadoDao.insert(estado);
        
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
        tes.setSubdisciplina(subDiscDAO.getPorId(1));
        tes.setInstitucionAdscripcion(instiDAO.getPorId(1));
        tes.setIdestado(1);
        tes.setDisciplina(discDAO.getPorId(1));
//     
        
        tesisDao.insert(tes);
    }
}
