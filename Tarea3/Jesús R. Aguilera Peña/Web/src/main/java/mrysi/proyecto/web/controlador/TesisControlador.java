package mrysi.proyecto.web.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import mrysi.proyecto.web.entidades.Tesis;
import mrysi.proyecto.web.oad.WebTesisOad;

/**
 *
 * @author jaguilera
 */
@Controller
public class TesisControlador {

    @Autowired
    WebTesisOad tesOad;

    @RequestMapping("/tesisadmin")
    public ModelAndView listarTesis() {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Tesis> lista = tesOad.findAll();
        mav.addObject("tesis", lista);
        return mav;
    }

    @RequestMapping("/buscarTesis")
    public ModelAndView buscarTesis(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Tesis> lista = tesOad.findByTituloContaining(cadena);
        mav.addObject("tesis", lista);
        return mav;
    }
    
    @RequestMapping(value="/agregarTesisF")
    public ModelAndView mostrarFormaAgregarTesis() {
        ModelAndView mav = new ModelAndView("formTesis");
        mav.addObject("tesis", new Tesis());
        return mav;
    }
    
    @RequestMapping(value="/agregarTesis", method = RequestMethod.POST)
    public String agregarTesis(@ModelAttribute("tesis") Tesis nuevoTesis) {
        tesOad.save(nuevoTesis);
        return "redirect:/tesisadmin";
    }

    
    @RequestMapping("/predecirTesis")
    @ResponseBody
    public List<Tesis> buscarTesisComenzandoCon(@RequestParam("cadena") String cadena) {
        return tesOad.findByTituloStartingWith(cadena);
    }
}