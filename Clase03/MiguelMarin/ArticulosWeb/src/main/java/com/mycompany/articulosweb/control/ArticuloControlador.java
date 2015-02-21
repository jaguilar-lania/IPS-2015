/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.articulosweb.control;

import com.mycompany.articulosweb.entidades.Articulo;
import com.mycompany.articulosweb.oad.ArticulosOad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author miguel
 */
@Controller
public class ArticuloControlador {
    @Autowired
    ArticulosOad artsOad ;
    
    @RequestMapping("/articulos")
    public ModelAndView listarArticulos(){
        ModelAndView mav = new ModelAndView("listaArticulos");
        List<Articulo> lista = artsOad.findAll();
        mav.addObject("articulos", lista);
        return mav;
    }
    
//    @RequestMapping("/buscarArticulos")
//    public ModelAndView buscarArticulosNombre(@RequestParam("cadena") String cadena){
//        ModelAndView mav = new ModelAndView("listaArticulos");
//        List<Articulo> lista = artsOad.findByNombreContaining(cadena);
//        mav.addObject("articulos", lista);
//        return mav;
//    }
//    
//    @RequestMapping("/predecirArticulos")
//    @ResponseBody
//    public List<Articulo> bucarArticulosComenzandoCon(@RequestParam("cadena") String cadena){
//     
//        return artsOad.findByNombreStartingWith(cadena);
//    }
    
    @RequestMapping("/buscarArticulos")
    public ModelAndView buscarArticulos(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaArticulos");
        List<Articulo> lista = artsOad.findByNombreContaining(cadena);
        mav.addObject("articulos", lista);
        return mav;
    }

    
    @RequestMapping("/predecirArticulos")
    @ResponseBody
    public List<Articulo> buscarArticulosComenzandoCon(@RequestParam("cadena") String cadena) {
        return artsOad.findByNombreStartingWith(cadena);
    }
}
