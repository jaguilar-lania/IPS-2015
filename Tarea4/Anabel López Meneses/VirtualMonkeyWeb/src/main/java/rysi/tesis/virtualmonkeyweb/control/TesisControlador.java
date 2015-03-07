/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rysi.tesis.virtualmonkeyweb.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    
    @Autowired
    EstadoDao edoDao;
    
    @Autowired
    AutorDao autorDao;
    
    @Autowired
    CondicionSitioDao condicionDao;
        
     @Autowired
    DirectorDao directorDao;
     
    @Autowired
    EspecieDao especieDao;
    
    @Autowired
    GradoAcademicoDao gradoDao;
    
    @Autowired
    InstitucionDao institucionDao;
    
    @Autowired
    SubdisciplinaDao subdisDao;
        
    /**
     *
     * @return
     */
    @RequestMapping("/tesis")
    public ModelAndView listarTesis(){
        ModelAndView mav = new ModelAndView("admonTesis");
        List<Tesis> lista1 = tesisDao.findAll();
        
        List<tesisDTO> listaDto = new ArrayList<>();
      
       //System.out.println(String.format("resgistros encontrados: %d ", 
               // tesisDao.count()));
        //buscar cada catalogo
                      
        for (Tesis tesis1 : lista1) {
                   
            listaDto.add(new tesisDTO(tesis1.getId(),
                tesis1.getAnio(),
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
    
    /**
     *
     * @param cadena
     * @return
     */
    @RequestMapping("/filtrarTesis")
    public ModelAndView buscarTesis(@RequestParam("cadena") String cadena){
        ModelAndView mav = new ModelAndView("admonTesis");
        List<Tesis> lista = tesisDao.findByTituloContaining(cadena);
       
        List<tesisDTO> listaDto = new ArrayList<>();
               
        for (Tesis tesis1 : lista) {
                   
            listaDto.add(new tesisDTO(tesis1.getId(),
                tesis1.getAnio(),
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
    
       
    @RequestMapping(value="/guardarTesis",method = RequestMethod.POST)
    public ModelAndView agregarTesis(@Valid @ModelAttribute("tesis") Tesis tes, BindingResult resultado){
        ModelAndView mav = new ModelAndView("editaTesis" );
        if (resultado.hasErrors()){
                        
           //estados
        List<Estado> estadoLista = edoDao.findAll();
        Map<String,String> estado = new HashMap<>();
        for (Estado edo : estadoLista){
            estado.put(edo.getId().toString(), edo.getNombre());
        }
         mav.addObject("listaEstado", estado);
                
         //autores
        List<Autor> autorLista = autorDao.findAll();
        Map<String,String> autor = new HashMap<>();
        for (Autor autor1 : autorLista){
            autor.put(autor1.getId().toString(), autor1.getNombre());
        }
         mav.addObject("listaAutor", autor);
                 
         //condicion sitio
          List<Condicionsitio> condicionLista = condicionDao.findAll();
        Map<String,String> condicion = new HashMap<>();
        for (Condicionsitio con : condicionLista){
            condicion.put(con.getId().toString(), con.getDescripcion());
        }
         mav.addObject("listaCondicion", condicion);
         
         //Director Tesis
          List<Directortesis> directorLista = directorDao.findAll();
        Map<String,String> director = new HashMap<>();
        for (Directortesis direc : directorLista){
            director.put(direc.getId().toString(), direc.getNombre());
        }
         mav.addObject("listaDirector", director); 
        
         //Especie Primate
          List<Especieprimate> especieLista = especieDao.findAll();
        Map<String,String> especie = new HashMap<>();
        for (Especieprimate esp : especieLista){
            especie.put(esp.getId().toString(), esp.getNombre());
        }
         mav.addObject("listaEspecie", especie); 
        
         //Grado Academico
          List<Gradoacademico> gradoLista = gradoDao.findAll();
        Map<String,String> grado = new HashMap<>();
        for (Gradoacademico grad : gradoLista){
            grado.put(grad.getId().toString(), grad.getGrado());
        }
         mav.addObject("listaGrado", grado); 
         
          //Institucion
          List<Institucion> institucionLista = institucionDao.findAll();
        Map<String,String> institucion = new HashMap<>();
        for (Institucion inst : institucionLista){
            institucion.put(inst.getId().toString(), inst.getNombre());
        }
         mav.addObject("listaInstitucion", institucion); 
         
          //Subdisciplina
          List<Subdisciplina> subLista = subdisDao.findAll();
        Map<String,String> subdisciplina = new HashMap<>();
        for (Subdisciplina sub : subLista){
            subdisciplina.put(sub.getId().toString(), sub.getNombre());
        }
         mav.addObject("listaSubdisciplina", subdisciplina);
         
         return mav;
        }        
            tesisDao.save(tes);
            //return "redirect:/tesis";
            return listarTesis();
            
    }
    
   
    
   /* @RequestMapping("/modificarTesis")
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
            
    }*/
    
       
    @RequestMapping("/eliminarTesis")
    public ModelAndView eliminarTesis(@RequestParam("idTesis") Integer idTesis){
        tesisDao.delete(idTesis);
        return listarTesis();
    }
    
    @RequestMapping("/buscarTesisPorId")
    public ModelAndView crearTesis(@RequestParam("idTesis") Integer IdTesis){
        ModelAndView mav = new ModelAndView("editaTesis" );
        Tesis tesisDao1 = tesisDao.findOne(IdTesis);
        
        //estados
        List<Estado> estadoLista = edoDao.findAll();
        Map<String,String> estado = new HashMap<>();
        for (Estado edo : estadoLista){
            estado.put(edo.getId().toString(), edo.getNombre());
        }
         mav.addObject("listaEstado", estado);
         
        //autores
        List<Autor> autorLista = autorDao.findAll();
        Map<String,String> autor = new HashMap<>();
        for (Autor autor1 : autorLista){
            autor.put(autor1.getId().toString(), autor1.getNombre());
        }
         mav.addObject("listaAutor", autor);
         
         //condicion sitio
          List<Condicionsitio> condicionLista = condicionDao.findAll();
        Map<String,String> condicion = new HashMap<>();
        for (Condicionsitio con : condicionLista){
            condicion.put(con.getId().toString(), con.getDescripcion());
        }
         mav.addObject("listaCondicion", condicion);
         
         //Director Tesis
          List<Directortesis> directorLista = directorDao.findAll();
        Map<String,String> director = new HashMap<>();
        for (Directortesis direc : directorLista){
            director.put(direc.getId().toString(), direc.getNombre());
        }
         mav.addObject("listaDirector", director); 
        
         //Especie Primate
          List<Especieprimate> especieLista = especieDao.findAll();
        Map<String,String> especie = new HashMap<>();
        for (Especieprimate esp : especieLista){
            especie.put(esp.getId().toString(), esp.getNombre());
        }
         mav.addObject("listaEspecie", especie); 
        
         //Grado Academico
          List<Gradoacademico> gradoLista = gradoDao.findAll();
        Map<String,String> grado = new HashMap<>();
        for (Gradoacademico grad : gradoLista){
            grado.put(grad.getId().toString(), grad.getGrado());
        }
         mav.addObject("listaGrado", grado); 
         
          //Institucion
          List<Institucion> institucionLista = institucionDao.findAll();
        Map<String,String> institucion = new HashMap<>();
        for (Institucion inst : institucionLista){
            institucion.put(inst.getId().toString(), inst.getNombre());
        }
         mav.addObject("listaInstitucion", institucion); 
         
          //Subdisciplina
          List<Subdisciplina> subLista = subdisDao.findAll();
        Map<String,String> subdisciplina = new HashMap<>();
        for (Subdisciplina sub : subLista){
            subdisciplina.put(sub.getId().toString(), sub.getNombre());
        }
         mav.addObject("listaSubdisciplina", subdisciplina);
         
        mav.addObject("tesis", tesisDao1);
        return mav;
    }
    
     
    @RequestMapping("/crearTesis")
    public ModelAndView crearTesis(){
        ModelAndView mav = new ModelAndView("editaTesis" );
        mav.addObject("tesis",new Tesis());
        
        //estados
        List<Estado> estadoLista = edoDao.findAll();
        Map<String,String> estado = new HashMap<>();
        for (Estado edo : estadoLista){
            estado.put(edo.getId().toString(), edo.getNombre());
        }
         mav.addObject("listaEstado", estado);
         
        //autores
        List<Autor> autorLista = autorDao.findAll();
        Map<String,String> autor = new HashMap<>();
        for (Autor autor1 : autorLista){
            autor.put(autor1.getId().toString(), autor1.getNombre());
        }
         mav.addObject("listaAutor", autor);
         
         //condicion sitio
          List<Condicionsitio> condicionLista = condicionDao.findAll();
        Map<String,String> condicion = new HashMap<>();
        for (Condicionsitio con : condicionLista){
            condicion.put(con.getId().toString(), con.getDescripcion());
        }
         mav.addObject("listaCondicion", condicion);
         
         //Director Tesis
          List<Directortesis> directorLista = directorDao.findAll();
        Map<String,String> director = new HashMap<>();
        for (Directortesis direc : directorLista){
            director.put(direc.getId().toString(), direc.getNombre());
        }
         mav.addObject("listaDirector", director); 
        
         //Especie Primate
          List<Especieprimate> especieLista = especieDao.findAll();
        Map<String,String> especie = new HashMap<>();
        for (Especieprimate esp : especieLista){
            especie.put(esp.getId().toString(), esp.getNombre());
        }
         mav.addObject("listaEspecie", especie); 
        
         //Grado Academico
          List<Gradoacademico> gradoLista = gradoDao.findAll();
        Map<String,String> grado = new HashMap<>();
        for (Gradoacademico grad : gradoLista){
            grado.put(grad.getId().toString(), grad.getGrado());
        }
         mav.addObject("listaGrado", grado); 
         
          //Institucion
          List<Institucion> institucionLista = institucionDao.findAll();
        Map<String,String> institucion = new HashMap<>();
        for (Institucion inst : institucionLista){
            institucion.put(inst.getId().toString(), inst.getNombre());
        }
         mav.addObject("listaInstitucion", institucion); 
         
          //Subdisciplina
          List<Subdisciplina> subLista = subdisDao.findAll();
        Map<String,String> subdisciplina = new HashMap<>();
        for (Subdisciplina sub : subLista){
            subdisciplina.put(sub.getId().toString(), sub.getNombre());
        }
         mav.addObject("listaSubdisciplina", subdisciplina); 
         
        return mav;
    }
    
        
    public Autor ObtenerAutorPorId(Integer idAutor){
        
        return autorDao.findOne(idAutor);
    }
    
    
    
    public Estado ObtenerEstadoPorId(Integer idEstado){
        
        return edoDao.findOne(idEstado);
    }
           
    public Condicionsitio ObtenerCondicionPorId(Integer idCondicion){
        
        return condicionDao.findOne(idCondicion);
    }
    
    
    public Directortesis ObtenerDirectorPorId(Integer idDirector){
        
        return directorDao.findOne(idDirector);
    }
    
      
    public Especieprimate ObtenerEspeciePorId(Integer idEspecie){
        
        return especieDao.findOne(idEspecie);
    }
    
    
    
    public Gradoacademico ObtenerGradoAcademicoPorId(Integer idGrado){
        
        return gradoDao.findOne(idGrado);
    }
        
    public Institucion ObtenerInstitucionPorId(Integer idInstitucion){
        
        return institucionDao.findOne(idInstitucion);
    }
      
    public Subdisciplina ObtenerSubdisciplinaPorId(Integer idSubdisciplina){
        
        return subdisDao.findOne(idSubdisciplina);
    }
}
