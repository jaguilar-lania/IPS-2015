/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb.control;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rysi.tesis.virtualmonkeyweb.Disciplinaestudio;
import rysi.tesis.virtualmonkeyweb.dao.DisciplinaDao;

/**
 *
 * @author Anny
 */
@Controller
public class DisciplinaControlador {
     @Autowired
     DisciplinaDao disciplinaDao;
    
        
    @RequestMapping("/disciplinas")
    public ModelAndView listarDisciplina(){
        
        ModelAndView mav = new ModelAndView("admonDisciplinas");
        List<Disciplinaestudio> lista = disciplinaDao.findAll();
                 
        mav.addObject("disciplinas", lista);
        return mav;
    
    }
    
    @RequestMapping("/filtrarDisciplinas")
    public ModelAndView buscarDisciplinas(@RequestParam("cadena") String cadena){
        ModelAndView mav = new ModelAndView("admonDisciplinas");
        List<Disciplinaestudio> lista = disciplinaDao.findByNombreContaining(cadena);
        mav.addObject("disciplinas", lista);
        return mav;
    }
    
       
    @RequestMapping("/guardarDisciplina")
    public String agregarTesis(@Valid @ModelAttribute("disciplinas") Disciplinaestudio dis, BindingResult resultado){
            
            if (resultado.hasErrors()){
                return "crearDisciplina";
            }
            disciplinaDao.save(dis);
                   
            return "redirect:/disciplinas";
            
    }
    
    /*@RequestMapping("/modificarDisciplina")
    public ModelAndView modificarDisciplina(@RequestParam("idDisciplina") Integer IdDisciplina,
            @RequestParam("nombre") String Nombre){
        
            //es modificar disciplina
            Disciplinaestudio disciplina1 = disciplinaDao.findOne(IdDisciplina);
            disciplina1.setNombre(Nombre);
            disciplinaDao.save(disciplina1);
          return listarDisciplina();
            
    }*/
    
    
    @RequestMapping("/eliminarDisciplina")
    public ModelAndView eliminarDisciplina(@RequestParam("idDisciplina") Integer idTesis){
        disciplinaDao.delete(idTesis);
        return listarDisciplina();
    }
    
    @RequestMapping("/buscarDisciplinaPorId")
    public ModelAndView crearDisciplina(@RequestParam("idDisciplina") Integer IdDisciplina){
        ModelAndView mav = new ModelAndView("editaDisciplina" );
        Disciplinaestudio disciplinaDao1 = disciplinaDao.findOne(IdDisciplina);
        
        mav.addObject("disciplina", disciplinaDao1);
        return mav;
    }
    
    @RequestMapping("/crearDisciplina")
    public ModelAndView crearDisciplina(){
        ModelAndView mav = new ModelAndView("editaDisciplina" );
        mav.addObject("disciplina",new Disciplinaestudio());
        return mav;
    }
        
}
