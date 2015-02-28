/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimemaven.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rgomez.articulos.inecolprimemaven.Disciplina;
import rgomez.articulos.inecolprimemaven.src.DisciplinasOad;

/**
 *
 * @author Subli
 */
@Controller
public class DisciplinaControlador {
    
    @Autowired
    DisciplinasOad disOad;
    
    @RequestMapping("/disciplinas")
    public ModelAndView listarDisciplinas(){
        ModelAndView mav = new ModelAndView("listaDisciplinas");
        List<Disciplina> lista = disOad.findAll();
        mav.addObject("disciplinas", lista);
        return mav;
    }
    
    @RequestMapping("/buscarDisciplina")
    public ModelAndView buscarDisciplinas(@RequestParam("cadena") String cadena){
        ModelAndView mav = new ModelAndView("listaDisciplinas");
        List<Disciplina> lista = disOad.findByNombreContaining(cadena);
        mav.addObject("disciplinas", lista);
        return mav;
    }
    
    
     // Conveniente presentar el forumario desde
    @RequestMapping(value="/agregarDisciplinaF")
    public ModelAndView mostrarFormaAgregarDisciplina() {
        ModelAndView mav = new ModelAndView("formDisciplina");
        mav.addObject("disciplina", new Disciplina());
        return mav;
    }
    
    @RequestMapping(value="/agregarDisciplina", method = RequestMethod.POST)
    public String agregarDisciplina(@ModelAttribute("disciplina") Disciplina nuevoDisciplina) {
        disOad.save(nuevoDisciplina);
        return "redirect:/disciplinas";
    }

}
