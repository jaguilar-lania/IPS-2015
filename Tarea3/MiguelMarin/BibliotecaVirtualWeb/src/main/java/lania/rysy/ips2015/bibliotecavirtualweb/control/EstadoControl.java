/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.control;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.EstadoOad;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author miguel
 */
@Controller

public class EstadoControl {
    
    @Autowired
    EstadoOad estadoOad;
    
     @RequestMapping("/tesis2")
    public ModelAndView estadoG(ModelMap model){
       
        List<Estado> lista = estadoOad.findAll();
        model.put("estados", lista);
        return new ModelAndView("contact",model);
    }
    
    @RequestMapping("/obtenerEstados")
    @ResponseBody
    public List<Estado> obtenerEstados() {
        List<Estado> lista = estadoOad.findAll();
        return lista;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public  List<Estado> initForm(Model model) {
//        Colour colour = new Colour();
//        model.addAttribute("colour", colour);
//        initModelList(model);
//        return "colour";
        List<Estado> lista = estadoOad.findAll();
        return lista;
        
    }
    
    @ModelAttribute("numberList")
    public List<Estado> documentNumberList(HttpServletRequest request){
        List<Estado> lista = estadoOad.findAll();
        return lista;
    }

    
   @RequestMapping(value = "/countryList", method = RequestMethod.GET)
    public String showHomePage(ModelMap model) {

        List<Estado> lista = estadoOad.findAll();
        model.put("countryList", lista);
        return "home";
    }

    
}
