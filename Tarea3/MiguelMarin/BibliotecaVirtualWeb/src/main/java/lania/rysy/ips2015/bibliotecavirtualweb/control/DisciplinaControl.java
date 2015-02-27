/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.control;

import java.util.List;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.DisciplinaOad;

import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author miguel
 */
@Controller
public class DisciplinaControl {
    
    @Autowired
    DisciplinaOad disciplinaOad;
    
//     @RequestMapping("/tesis")
//    public ModelAndView listarTesis(){
//        ModelAndView mav = new ModelAndView("listarTesis");
//        List<Disciplina> lista = disciplinaOad.findAll();
//        mav.addObject("tesis", lista);
//        return mav;
//    }
    
}
