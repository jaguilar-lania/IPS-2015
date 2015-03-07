/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey.control;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import rysi.virtual.virtualmonkey.Catalogotesis;
import rysi.virtual.virtualmonkey.Disciplina;
import rysi.virtual.virtualmonkey.Especie;
import rysi.virtual.virtualmonkey.Estado;
import rysi.virtual.virtualmonkey.Grado;
import rysi.virtual.virtualmonkey.Institucion;
import rysi.virtual.virtualmonkey.Subdisciplina;
import rysi.virtual.virtualmonkey.oad.DisciplinaOad;
import rysi.virtual.virtualmonkey.oad.EspecieOad;
import rysi.virtual.virtualmonkey.oad.EstadoOad;
import rysi.virtual.virtualmonkey.oad.GradoOad;
import rysi.virtual.virtualmonkey.oad.InstitucionOad;
import rysi.virtual.virtualmonkey.oad.SubdisciplinaOad;
import rysi.virtual.virtualmonkey.oad.TesisOad;

/**
 *
 * @author user
 */
@Controller
public class TesisControlador {
    
      @Autowired
     TesisOad artsOad;
     
     @Autowired
    EstadoOad estadoOad;
    
    @Autowired
    EspecieOad especieOad;
    
    @Autowired
    InstitucionOad institucionOad;
    
    @Autowired
    DisciplinaOad disciplinaOad;
    
    @Autowired
    SubdisciplinaOad subDisciplinaOad;
    
    @Autowired
    GradoOad gradoOad;

    @RequestMapping("/tesis")
    public ModelAndView listarTesis() {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Catalogotesis> lista = artsOad.findAll();
        mav.addObject("tesis", lista);
        return mav;
    }
@RequestMapping("/buscarTesis")
    public ModelAndView buscarTesis(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Catalogotesis> lista = artsOad.findByTituloContaining(cadena);
        mav.addObject("tesis", lista);
        return mav;
    }
    
    @RequestMapping("/editarTesis")
    public ModelAndView editarTesis(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("editarTesis");
        List<Especie> listaEspecie = especieOad.findAll();
        List<Estado> listaEstado = estadoOad.findAll();
        List<Institucion> listaInstitucion = institucionOad.findAll();
        List<Disciplina> listaDisciplina = disciplinaOad.findAll();
        List<Grado> listagrado = gradoOad.findAll();
        List<Subdisciplina> listaSubdisciplina = subDisciplinaOad.findAll();
        
        
         mav.addObject("grado", listagrado);        
         mav.addObject("institucion", listaInstitucion);
         mav.addObject("especie", listaEspecie); 
         mav.addObject("estados", listaEstado);
         mav.addObject("disciplina", listaDisciplina);
        mav.addObject("subdisciplina", listaSubdisciplina);
        
        mav.addObject("tesisEntidad", new Catalogotesis());
        
        List<Catalogotesis> lista = artsOad.findByTituloContaining(cadena);
        mav.addObject("tesisEntidad", new Catalogotesis());
        mav.addObject("tesis", lista);
        return mav;
    }

    
    @RequestMapping("/predecirTesis")
    @ResponseBody
    public List<Catalogotesis> buscarTesisComenzandoCon(@RequestParam("cadena") String cadena) {
        return artsOad.findByTituloStartingWith(cadena);
    }
    
    @RequestMapping("/eliminar")
    public ModelAndView eliminarTesis(@RequestParam("idtesis") Integer idtesis) { 
        ModelAndView mav = new ModelAndView("confirmacion"); 
ModelAndView mav1 = new ModelAndView("salir"); 
        try{
            artsOad.delete(idtesis);
        }catch(Exception e)
        {
            return mav1;
        }
        return mav;
        
    }
    
    @RequestMapping("/regresar")
    public String regresar() { 
        return "redirect:/tesis";
    }
    
    @RequestMapping("/salir")
    public ModelAndView salir() { 
        ModelAndView mav = new ModelAndView("salir"); 
        return mav;
    }
    
    
    
 @RequestMapping("/registrar")
    public ModelAndView registrar() { 
        ModelAndView mav = new ModelAndView("registrarTesis"); 
        List<Especie> listaEspecie = especieOad.findAll();
        List<Estado> listaEstado = estadoOad.findAll();
        List<Institucion> listaInstitucion = institucionOad.findAll();
        List<Disciplina> listaDisciplina = disciplinaOad.findAll();
        List<Grado> listagrado = gradoOad.findAll();
        List<Subdisciplina> listaSubdisciplina = subDisciplinaOad.findAll();
        
        
         mav.addObject("grado", listagrado);        
         mav.addObject("institucion", listaInstitucion);
         mav.addObject("especie", listaEspecie); 
         mav.addObject("estados", listaEstado);
         mav.addObject("disciplina", listaDisciplina);
        mav.addObject("subdisciplina", listaSubdisciplina);
        
        mav.addObject("tesisEntidad", new Catalogotesis());
        return mav;
    }
    
       @RequestMapping(value="/registrarTesis", method = RequestMethod.POST)
    public ModelAndView agregarTesis(@Valid @ModelAttribute("tesisEntidad") Catalogotesis nuevaTesis, BindingResult resultado) {
        if (resultado.hasErrors()) {
        ModelAndView mav = new ModelAndView("registrarTesis"); 
        List<Especie> listaEspecie = especieOad.findAll();
        List<Estado> listaEstado = estadoOad.findAll();
        List<Institucion> listaInstitucion = institucionOad.findAll();
        List<Disciplina> listaDisciplina = disciplinaOad.findAll();
        List<Grado> listagrado = gradoOad.findAll();
        List<Subdisciplina> listaSubdisciplina = subDisciplinaOad.findAll();
        
        
         mav.addObject("grado", listagrado);        
         mav.addObject("institucion", listaInstitucion);
         mav.addObject("especie", listaEspecie); 
         mav.addObject("estados", listaEstado);
         mav.addObject("disciplina", listaDisciplina);
        mav.addObject("subdisciplina", listaSubdisciplina);
        
        return mav;
        }
           ModelAndView mav1 = new ModelAndView("confirmacionDisciplina");  
            artsOad.save(nuevaTesis);
        
        return mav1;
    }

    
 
    
}
