/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgomez.articulos.inecolprimefinal.control;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rgomez.articulos.inecolprimefinal.Disciplina;
import rgomez.articulos.inecolprimefinal.src.DisciplinasOad;

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
    public String agregarDisciplina(@Valid @ModelAttribute("disciplina") Disciplina nuevoDisciplina, BindingResult resultado) {
         if (resultado.hasErrors()) {
            return "formDisciplina";
        }
        disOad.save(nuevoDisciplina);
        return "redirect:/disciplinas";
    }
    
    @RequestMapping(value="/borrarDisciplina")
    public String borrarDisciplina(@RequestParam("iddisciplina") int iddisciplina  ) {
        try{
            disOad.delete(iddisciplina);
        }catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return "redirect:/disciplinas";
    }
    
    @RequestMapping("/editarDisciplinaF")
    public ModelAndView mostrarFormaAgregarDisciplina(@RequestParam("iddisciplina") Integer id) {
        ModelAndView mav = new ModelAndView("formDisciplina");
        mav.addObject("disciplina", disOad.findOne(id));
        return mav;
    }
   
}
