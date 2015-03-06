/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey.control;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rysi.virtual.virtualmonkey.Disciplina;
import rysi.virtual.virtualmonkey.oad.DisciplinaOad;

/**
 *
 * @author user
 */
@Controller
public class DisciplinaControlador {
    
     @Autowired
     DisciplinaOad artsOad;

    @RequestMapping("/disciplina")
    public ModelAndView listarDisciplina() {
        ModelAndView mav = new ModelAndView("listaDisciplina");
        List<Disciplina> lista = artsOad.findAll();
        mav.addObject("discEntidad", new Disciplina());
        mav.addObject("disciplina", lista);
        return mav;
    }
    
    
@RequestMapping("/buscarDisciplina")
    public ModelAndView buscarDisciplina(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaDisciplina");
        List<Disciplina> lista = artsOad.findByNombreContaining(cadena);
        mav.addObject("discEntidad", new Disciplina());
        mav.addObject("disciplina", lista);
        return mav;
    }
    
    //guarda los cambios de la edicion en la disciplina
    @RequestMapping("/registrarEditarDisciplina")
    public ModelAndView registrarDisciplina(@RequestParam("iddisciplina") int iddisciplina,@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion) { 
        
        ModelAndView mav = new ModelAndView("confirmacionRegistroDisciplina"); 
        Disciplina cat1 = new Disciplina();
        cat1.setIddisciplina(iddisciplina);
        cat1.setDescripcion(descripcion);
        cat1.setNombre(nombre);
        
        
        artsOad.save(cat1);
        
        return mav;
    }

    
    //pinta la pantalla de editar con parametros en inputs
    @RequestMapping("/editarDisciplina")
    public ModelAndView editarDisciplina(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("editarDisciplina");
        List<Disciplina> lista = artsOad.findByNombreContaining(cadena);
        mav.addObject("discEntidad", new Disciplina());
        mav.addObject("disciplina", lista);
        return mav;
    }

    
     @RequestMapping(value="/eliminarDisciplina")
    public String eliminarDisciplina(@RequestParam("iddisciplina") int iddisciplina  ) {
        try{
            artsOad.delete(iddisciplina);
        }catch(Exception e)
        {
            System.out.println("Error- " + e.getMessage());
        }
        return "redirect:/disciplina";
    }
    
    
    
    
    @RequestMapping("/regresarDisciplina")
    public String regresarDisciplina() { 
        return "redirect:/disciplina";
    }
    
    @RequestMapping("/salirDisciplina")
    public ModelAndView salirDisciplina() { 
        ModelAndView mav = new ModelAndView("salirDisciplina"); 
        return mav;
    }
    
    
    
 @RequestMapping("/registrarDisciplina")
    public ModelAndView registrar() { 
        ModelAndView mav = new ModelAndView("registrarDisciplina"); 
        mav.addObject("discEntidad", new Disciplina());
        return mav;
    }
    

    
     @RequestMapping(value="/registrarDisciplina", method = RequestMethod.POST)
    public String agregarDisciplina(@ModelAttribute("discEntidad") Disciplina nuevaDisciplina) {
        try{
            artsOad.save(nuevaDisciplina);
        }catch(Exception e)
        {
            System.out.println("Error- " + e.getMessage());
        }
        return "redirect:/disciplina";
    }
   
}
