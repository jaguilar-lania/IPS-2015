/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import rysi.virtual.virtualmonkey.Catalogotesis;
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
    public ModelAndView listarTesis() {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Disciplina> lista = artsOad.findAll();
        mav.addObject("disciplina", lista);
        return mav;
    }
@RequestMapping("/buscarDisciplina")
    public ModelAndView buscarTesis(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Disciplina> lista = artsOad.findByNombreContaining(cadena);
        mav.addObject("disciplina", lista);
        return mav;
    }
    
    @RequestMapping("/editarDisciplina")
    public ModelAndView editarTesis(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("editarTesis");
        List<Disciplina> lista = artsOad.findByNombreContaining(cadena);
        mav.addObject("disciplina", lista);
        return mav;
    }

    
    
    
    @RequestMapping("/eliminar")
    public ModelAndView eliminarTesis(@RequestParam("iddisciplina") Integer iddisciplina) { 
        System.out.println(iddisciplina);
        ModelAndView mav = new ModelAndView("confirmacion"); 
        artsOad.delete(iddisciplina);
        return mav;
    }
    
    @RequestMapping("/regresar")
    public ModelAndView regresar() { 
        ModelAndView mav = new ModelAndView("listaTesis"); 
        return mav;
    }
    
    @RequestMapping("/salir")
    public ModelAndView salir() { 
        ModelAndView mav = new ModelAndView("salir"); 
        return mav;
    }
    
    
    
 @RequestMapping("/registrar")
    public ModelAndView registrar() { 
        ModelAndView mav = new ModelAndView("registrarTesis"); 
        return mav;
    }
    
    @RequestMapping("/registrarTesis")
    public ModelAndView registrarTesis(@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion
            ) { 
        
        ModelAndView mav = new ModelAndView("confirmacionRegistro"); 
        Disciplina cat1 = new Disciplina();
        
        cat1.setDescripcion(descripcion);
        cat1.setNombre(nombre);
       
        
        artsOad.save(cat1);
        
        return mav;
    }
    
 
    
}
