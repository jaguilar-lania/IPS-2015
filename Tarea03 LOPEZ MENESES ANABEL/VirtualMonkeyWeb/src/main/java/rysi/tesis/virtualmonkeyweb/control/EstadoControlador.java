/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb.control;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import rysi.tesis.virtualmonkeyweb.Estado;
import rysi.tesis.virtualmonkeyweb.dao.EstadoDao;

/**
 *
 * @author Anny
 */
@Controller
public class EstadoControlador {
    
    @Autowired
    EstadoDao estadoDao;
   
   public ModelAndView listarEstados(){
        ModelAndView mav = new ModelAndView("admonTesis");
        List<Estado> lista = estadoDao.findAll();
        mav.addObject("estados", lista);
        return mav;
    
    }
   
   @RequestMapping("/admonTesis")
   public class LlenarEstados {
       @RequestMapping(method = RequestMethod.GET)
       public String listaEdos(ModelMap model){
           List<Estado> estados = estadoDao.findAll();
           model.addAttribute("listaEstados",estados);
           return "admonTesis";
       }
       
   }
   //List estados = estadoDao.findAll();
   //request.setAttribute("listaEstados",estados);
  
      
   @ModelAttribute("cmbEstados")
   public Map<Integer, String> ListaEstadosCargar(){
        Map<Integer,String> estadoLista = new LinkedHashMap<Integer,String>();
        estadoLista.put(1,"Uno");
        estadoLista.put(2,"Dos");
        estadoLista.put(3,"Tres");
        return estadoLista;
   }
          
   
    
}
