package rysi.articulos.articulosweb.control;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import rysi.articulos.articulosweb.entidades.Articulo;
import rysi.articulos.articulosweb.oad.ArticulosOad;

/**
 *
 * @author jaguilar
 */
@Controller
public class ArticulosControlador {

    @Autowired
    ArticulosOad artsOad;

    @RequestMapping("/articulos")
    public ModelAndView listarArticulos() {
        ModelAndView mav = new ModelAndView("listaArticulos");
        List<Articulo> lista = artsOad.findAll();
        mav.addObject("articulos", lista);
        return mav;
    }

    @RequestMapping("/buscarArticulos")
    public ModelAndView buscarArticulos(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaArticulos");
        List<Articulo> lista = artsOad.findByNombreContaining(cadena);
        mav.addObject("articulos", lista);
        return mav;
    }
    
    // Conveniente presentar el forumario desde
    @RequestMapping("/agregarArticuloF")
    public ModelAndView mostrarFormaAgregarArticulo() {
        ModelAndView mav = new ModelAndView("formArticulo");
        mav.addObject("articulo", new Articulo());
        return mav;
    }
    
    @RequestMapping("/editarArticuloF")
    public ModelAndView mostrarFormaAgregarArticulo(@RequestParam("id") Integer id) {
        ModelAndView mav = new ModelAndView("formArticulo");
        mav.addObject("articulo", artsOad.findOne(id));
        return mav;
    }
    
    @RequestMapping(value="/agregarArticulo", method = RequestMethod.POST)
    public String agregarArticulo(@Valid @ModelAttribute("articulo") Articulo art, BindingResult resultado) {
        if (resultado.hasErrors()) {
            return "formArticulo";
        }
        artsOad.save(art);
        return "redirect:/articulos";
    }

    
    @RequestMapping("/predecirArticulos")
    @ResponseBody
    public List<Articulo> buscarArticulosComenzandoCon(@RequestParam("cadena") String cadena) {
        return artsOad.findByNombreStartingWith(cadena);
    }
}







