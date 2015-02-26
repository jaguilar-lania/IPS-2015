/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.control;

import java.util.List;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.TesisOad;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Tesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author miguel
 */
@Controller
public class TesisControlador {
    
    
     @Autowired
    TesisOad tesisOad ;
    
    @RequestMapping("/tesis")
    public ModelAndView listarTesis(){
        ModelAndView mav = new ModelAndView("listarTesis");
        List<Tesis> lista = tesisOad.findAll();
        mav.addObject("tesis", lista);
        return mav;
    }
    

    
//    @RequestMapping("/buscarArticulos")
//    public ModelAndView buscarArticulos(@RequestParam("cadena") String cadena) {
//        ModelAndView mav = new ModelAndView("listaArticulos");
//        List<Tesis> lista = tesisOad.findByNombreContaining(cadena);
//        mav.addObject("articulos", lista);
//        return mav;
//    }
//
//    
//    @RequestMapping("/predecirArticulos")
//    @ResponseBody
//    public List<Tesis> buscarArticulosComenzandoCon(@RequestParam("cadena") String cadena) {
//        return tesisOad.findByNombreStartingWith(cadena);
//    }
}
