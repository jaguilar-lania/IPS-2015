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
import rgomez.articulos.inecolprimemaven.Tesis;
import rgomez.articulos.inecolprimemaven.src.TesisOad;

/**
 *
 * @author Subli
 */
@Controller
public class TesisControlador {
    
    @Autowired
    TesisOad tesoad;
    
    @RequestMapping("/tesis")
    public ModelAndView listarTesis(){
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Tesis> lista = tesoad.findAll();
        mav.addObject("tesis", lista);
        return mav;
    }
    
    @RequestMapping("/buscarTesis")
    public ModelAndView buscarTesis(@RequestParam("cadena") String cadena){
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Tesis> lista = tesoad.findByNombreContaining(cadena);
        mav.addObject("tesis", lista);
        return mav;
    }
    
    
     // Conveniente presentar el forumario desde
    @RequestMapping(value="/agregarTesisF")
    public ModelAndView mostrarFormaAgregarTesis() {
        ModelAndView mav = new ModelAndView("formTesis");
        mav.addObject("tesis", new Tesis());
        return mav;
    }
    
    @RequestMapping(value="/agregarTesis", method = RequestMethod.POST)
    public String agregarTesis(@ModelAttribute("tesis") Tesis nuevoTesis) {
        tesoad.save(nuevoTesis);
        return "redirect:/tesis";
    }
}
