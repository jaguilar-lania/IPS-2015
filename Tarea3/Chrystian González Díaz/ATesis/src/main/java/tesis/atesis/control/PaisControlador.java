/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.atesis.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import tesis.atesis.entidades.Pais;
import tesis.atesis.oad.PaisOad;

/**
 *
 * @author Chrys
 */
@Controller
public class PaisControlador {
    
    @Autowired
    PaisOad artsOad;

    @RequestMapping("/articulos")
    public ModelAndView listarArticulos() {
        ModelAndView mav = new ModelAndView("listaPaises");
        List<Pais> lista = artsOad.findAll();
        mav.addObject("pais", lista);
        return mav;
    }

    @RequestMapping("/buscarArticulos")
    public ModelAndView buscarArticulos(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaPaises");
        List<Pais> lista = artsOad.findByNombreContaining(cadena);
        mav.addObject("pais", lista);
        return mav;
    }

    
    @RequestMapping("/predecirArticulos")
    @ResponseBody
    public List<Pais> buscarArticulosComenzandoCon(@RequestParam("cadena") String cadena) {
        return artsOad.findByNombreStartingWith(cadena);
    }
    
}
