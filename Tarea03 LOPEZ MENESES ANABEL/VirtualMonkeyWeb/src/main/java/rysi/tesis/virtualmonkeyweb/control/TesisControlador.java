/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rysi.tesis.virtualmonkeyweb.control;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rysi.tesis.virtualmonkey.dto.tesisDTO;
import rysi.tesis.virtualmonkeyweb.Autor;
import rysi.tesis.virtualmonkeyweb.Condicionsitio;
import rysi.tesis.virtualmonkeyweb.Directortesis;
import rysi.tesis.virtualmonkeyweb.Especieprimate;
import rysi.tesis.virtualmonkeyweb.Estado;
import rysi.tesis.virtualmonkeyweb.Gradoacademico;
import rysi.tesis.virtualmonkeyweb.Institucion;
import rysi.tesis.virtualmonkeyweb.Subdisciplina;
import rysi.tesis.virtualmonkeyweb.Tesis;
import rysi.tesis.virtualmonkeyweb.dao.AutorDao;
import rysi.tesis.virtualmonkeyweb.dao.CondicionSitioDao;
import rysi.tesis.virtualmonkeyweb.dao.DirectorDao;
import rysi.tesis.virtualmonkeyweb.dao.EspecieDao;
import rysi.tesis.virtualmonkeyweb.dao.EstadoDao;
import rysi.tesis.virtualmonkeyweb.dao.GradoAcademicoDao;
import rysi.tesis.virtualmonkeyweb.dao.InstitucionDao;
import rysi.tesis.virtualmonkeyweb.dao.SubdisciplinaDao;

import rysi.tesis.virtualmonkeyweb.dao.TesisDao;

/**
 *
 * @author Anny
 */
@Controller
public class TesisControlador {
    
    @Autowired
    TesisDao tesisDao;
        
    @RequestMapping("/tesis")
    public ModelAndView listarTesis(){
        
        ModelAndView mav = new ModelAndView("admonTesis");
        List<Tesis> lista = tesisDao.findAll();
        List<tesisDTO> listaDto = new ArrayList<>();
      
       System.out.println(String.format("resgistros encontrados: %d ", 
                tesisDao.count()));
        //buscar cada catalogo
         
        for (Tesis tesis1 : lista) {
                   
            listaDto.add(new tesisDTO(tesis1.getId(),
                tesis1.getAño(),
                tesis1.getIdautor(),
                ObtenerAutorPorId(tesis1.getIdautor()).getNombre() ,
                tesis1.getIdcondicionsitio(),
                ObtenerCondicionPorId(tesis1.getIdcondicionsitio()).getDescripcion(),
                tesis1.getIddirectortesis(),
                ObtenerDirectorPorId(tesis1.getIddirectortesis()).getNombre(),
                tesis1.getIdespecieprimate(),
                ObtenerEspeciePorId(tesis1.getIdespecieprimate()).getNombre(),
                tesis1.getIdestado(),
                ObtenerEstadoPorId(tesis1.getIdestado()).getNombre(),
                tesis1.getIdgradoobtenido(),
                ObtenerGradoAcademicoPorId(tesis1.getIdgradoobtenido()).getGrado(),
                tesis1.getIdinstitucion(),
                ObtenerInstitucionPorId(tesis1.getIdinstitucion()).getNombre(),
                tesis1.getIdsubdisciplina(),
                ObtenerSubdisciplinaPorId(tesis1.getIdsubdisciplina()).getNombre(),
                tesis1.getTitulo()               
            ));
        }
          
        mav.addObject("tesis", listaDto);
        return mav;
    
    }
    
    @RequestMapping("/filtrarTesis")
    public ModelAndView buscarTesis(@RequestParam("cadena") String cadena){
        ModelAndView mav = new ModelAndView("admonTesis");
        List<Tesis> lista = tesisDao.findByTituloContaining(cadena);
       
        List<tesisDTO> listaDto = new ArrayList<>();
               
        for (Tesis tesis1 : lista) {
                   
            listaDto.add(new tesisDTO(tesis1.getId(),
                tesis1.getAño(),
                tesis1.getIdautor(),
                ObtenerAutorPorId(tesis1.getIdautor()).getNombre() ,
                tesis1.getIdcondicionsitio(),
                ObtenerCondicionPorId(tesis1.getIdcondicionsitio()).getDescripcion(),
                tesis1.getIddirectortesis(),
                ObtenerDirectorPorId(tesis1.getIddirectortesis()).getNombre(),
                tesis1.getIdespecieprimate(),
                ObtenerEspeciePorId(tesis1.getIdespecieprimate()).getNombre(),
                tesis1.getIdestado(),
                ObtenerEstadoPorId(tesis1.getIdestado()).getNombre(),
                tesis1.getIdgradoobtenido(),
                ObtenerGradoAcademicoPorId(tesis1.getIdgradoobtenido()).getGrado(),
                tesis1.getIdinstitucion(),
                ObtenerInstitucionPorId(tesis1.getIdinstitucion()).getNombre(),
                tesis1.getIdsubdisciplina(),
                ObtenerSubdisciplinaPorId(tesis1.getIdsubdisciplina()).getNombre(),
                tesis1.getTitulo()               
            ));
        }
          
        mav.addObject("tesis", listaDto);
        return mav;
    }
    
       
    @RequestMapping("/guardarTesis")
    public ModelAndView agregarTesis(@RequestParam("titulo") String Titulo, 
            @RequestParam("anio") Integer Anio,
            @RequestParam("autor") Integer Autor,
            @RequestParam("condicion") Integer Condicion,
            @RequestParam("director") Integer Director,
            @RequestParam("especie") Integer Especie,
            @RequestParam("estado") Integer Estado,
            @RequestParam("grado") Integer Grado,
            @RequestParam("institucion") Integer Institucion,
            @RequestParam("subdisciplina") Integer Subdisciplina){
                
            Tesis tesis1 = new Tesis();
            tesis1.setTitulo(Titulo);
            tesis1.setAño(Anio);
            tesis1.setIdautor(Autor);
            tesis1.setIdcondicionsitio(Condicion);
            tesis1.setIddirectortesis(Director);
            tesis1.setIdespecieprimate(Especie);
            tesis1.setIdestado(Estado);
            tesis1.setIdgradoobtenido(Grado);
            tesis1.setIdinstitucion(Institucion);
            tesis1.setIdsubdisciplina(Subdisciplina);

            tesisDao.save(tesis1);
       
            return listarTesis();
            
    }
    
    @RequestMapping("/modificarTesis")
    public ModelAndView modificarTesis(@RequestParam("titulo") String Titulo, 
            @RequestParam("anio") Integer Anio,
            @RequestParam("autor") Integer Autor,
            @RequestParam("condicion") Integer Condicion,
            @RequestParam("director") Integer Director,
            @RequestParam("especie") Integer Especie,
            @RequestParam("estado") Integer Estado,
            @RequestParam("grado") Integer Grado,
            @RequestParam("institucion") Integer Institucion,
            @RequestParam("subdisciplina") Integer Subdisciplina,
            @RequestParam("idTesis") Integer idTesis){
            //es modificar tesis
            Tesis tesis1 = tesisDao.findOne(idTesis);
            tesis1.setTitulo(Titulo);
            tesis1.setAño(Anio);
            tesis1.setIdautor(Autor);
            tesis1.setIdcondicionsitio(Condicion);
            tesis1.setIddirectortesis(Director);
            tesis1.setIdespecieprimate(Especie);
            tesis1.setIdestado(Estado);
            tesis1.setIdgradoobtenido(Grado);
            tesis1.setIdinstitucion(Institucion);
            tesis1.setIdsubdisciplina(Subdisciplina);

            tesisDao.save(tesis1);
          return listarTesis();
            
    }
    
    
    @RequestMapping("/eliminarTesis")
    public ModelAndView eliminarTesis(@RequestParam("idTesis") Integer idTesis){
        tesisDao.delete(idTesis);
        return listarTesis();
    }
    
    @RequestMapping("/buscarTesisPorId")
    public ModelAndView buscarTesisPorId(@RequestParam("idTesis") Integer IdTesis){
        ModelAndView mav = new ModelAndView("editaTesis" );
        Tesis tesisDao1 = tesisDao.findOne(IdTesis);
        
        mav.addObject("tesisId", tesisDao1);
        return mav;
    }
    
        
    @Autowired
    AutorDao autorDao;
    
    public Autor ObtenerAutorPorId(Integer idAutor){
        
        return autorDao.findOne(idAutor);
    }
    
    @Autowired
    EstadoDao edoDao;
    
    public Estado ObtenerEstadoPorId(Integer idEstado){
        
        return edoDao.findOne(idEstado);
    }
    
    @Autowired
    CondicionSitioDao condicionDao;
    
    public Condicionsitio ObtenerCondicionPorId(Integer idCondicion){
        
        return condicionDao.findOne(idCondicion);
    }
    
     @Autowired
    DirectorDao directorDao;
    
    public Directortesis ObtenerDirectorPorId(Integer idDirector){
        
        return directorDao.findOne(idDirector);
    }
    
    @Autowired
    EspecieDao especieDao;
    
    public Especieprimate ObtenerEspeciePorId(Integer idEspecie){
        
        return especieDao.findOne(idEspecie);
    }
    
    @Autowired
    GradoAcademicoDao gradoDao;
    
    public Gradoacademico ObtenerGradoAcademicoPorId(Integer idGrado){
        
        return gradoDao.findOne(idGrado);
    }
    
    @Autowired
    InstitucionDao institucionDao;
    
    public Institucion ObtenerInstitucionPorId(Integer idInstitucion){
        
        return institucionDao.findOne(idInstitucion);
    }
    
    @Autowired
    SubdisciplinaDao subdisDao;
    
    public Subdisciplina ObtenerSubdisciplinaPorId(Integer idSubdisciplina){
        
        return subdisDao.findOne(idSubdisciplina);
    }
}
