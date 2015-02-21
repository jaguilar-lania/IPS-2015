package rysi.articulos.articulosweb.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}










