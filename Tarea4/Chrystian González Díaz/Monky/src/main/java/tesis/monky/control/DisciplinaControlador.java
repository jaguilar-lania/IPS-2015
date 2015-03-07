/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.monky.control;

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
import tesis.monky.entidades.Disciplina;
import tesis.monky.oad.DisciplinaOad;

/**
 *
 * @author Chrys
 */

@Controller
public class DisciplinaControlador {
    
    @Autowired
    DisciplinaOad artsOad;

    @RequestMapping("/disciplinas")
    public ModelAndView listarDisciplina() {
        ModelAndView mav = new ModelAndView("listaDisciplinas");
        List<Disciplina> lista = artsOad.findAll();
        mav.addObject("disciplinas", lista);
        return mav;
    }

    @RequestMapping("/buscarDisciplinas")
    public ModelAndView buscarDisciplina(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaDisciplinas");
        List<Disciplina> lista = artsOad.findByDescripcionContaining(cadena);
        mav.addObject("disciplinas", lista);
        return mav;
    }
    
    @RequestMapping("/agregarDisciplinaF")
    public ModelAndView mostrarFormaAgregarDisciplina() {
        ModelAndView mav = new ModelAndView("formDisciplina");
        mav.addObject("disciplina", new Disciplina());
        return mav;
    }
    
    @RequestMapping("/editarDisciplinaF")
    public ModelAndView mostrarFormaAgregarDisciplina(@RequestParam("id") Integer id) {
        ModelAndView mav = new ModelAndView("formDisciplina");
        mav.addObject("disciplina", artsOad.findOne(id));
        return mav;
    }
    
    
    @RequestMapping(value="/agregarDisciplina", method = RequestMethod.POST)
    public String agregarArticulo(@Valid @ModelAttribute("disciplina") Disciplina dis, BindingResult resultado) {
        if (resultado.hasErrors()) {
            return "formDisciplina";
        }
        artsOad.save(dis);
        return "redirect:/disciplinas";
    }
    
    
}
