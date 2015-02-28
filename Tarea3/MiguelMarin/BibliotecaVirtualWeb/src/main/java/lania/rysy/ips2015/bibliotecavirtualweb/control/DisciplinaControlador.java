/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.control;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.DisciplinaOad;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Disciplina;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Especie;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Estado;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.InstitucionAdscripcion;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Subdisciplina;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Tesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author miguel
 */
@Controller
public class DisciplinaControlador {
    
     @Autowired
    DisciplinaOad disciplinaAOad;
    
     
     @RequestMapping("/disciplina")
    public ModelAndView listarDisciplina(){
        ModelAndView mav = new ModelAndView("listarDisciplina");
        List<Disciplina> listaDis = disciplinaAOad.findAll();
        mav.addObject("disciplinaEnt", new Disciplina());
        mav.addObject("disciplinas", listaDis);
        return mav;
    }
    
     @RequestMapping("/buscarDisciplina")
    public ModelAndView buscarDisciplina(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listarDisciplina");
        List<Disciplina> listaDis = disciplinaAOad.findBydisciplinaContaining(cadena.toUpperCase());
        mav.addObject("disciplinaEnt", new Disciplina());
        mav.addObject("disciplinas", listaDis);
        return mav;
    }
    
    @RequestMapping(value="/agregarDisciplina", method = RequestMethod.POST)
    public String agregarDisciplina(@ModelAttribute("disciplinaEnt") Disciplina nuevaDisciplina) {
        try{
            disciplinaAOad.save(nuevaDisciplina);
        }catch(Exception e)
        {
            System.out.println("Error- " + e.getMessage());
        }
        return "redirect:/disciplina";
    }
    
    @RequestMapping(value="/borrarDisciplina")
    public String borrarDisciplina(@RequestParam("iddisciplina") int iddisciplina  ) {
        try{
            disciplinaAOad.delete(iddisciplina);
        }catch(Exception e)
        {
            System.out.println("Error- " + e.getMessage());
        }
        return "redirect:/disciplina";
    }
    
     @RequestMapping(value="/editarDisciplina")
    public ModelAndView editarDisciplina(@RequestParam("iddisciplina") int iddisciplina  ) {
        ModelAndView mav = new ModelAndView("listarDisciplina");
        List<Disciplina> listaDis = disciplinaAOad.findAll();
        Disciplina disciplinaEnt = disciplinaAOad.findOne(iddisciplina);
        mav.addObject("disciplinaEnt", disciplinaEnt);
        mav.addObject("disciplinas", listaDis);
        return mav;
    }
     
}
