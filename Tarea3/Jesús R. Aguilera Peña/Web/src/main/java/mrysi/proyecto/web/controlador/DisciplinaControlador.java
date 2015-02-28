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
import mrysi.proyecto.web.entidades.Disciplina;
import mrysi.proyecto.web.oad.WebDisciplinaOad;

/**
 *
 * @author jaguilera
 */
@Controller
public class DisciplinaControlador {

    @Autowired
    WebDisciplinaOad disOad;

    @RequestMapping("/disciplinaadmin")
    public ModelAndView listarDisciplina() {
        ModelAndView mav = new ModelAndView("listaDisciplina");
        List<Disciplina> lista = disOad.findAll();
        mav.addObject("disciplina", lista);
        return mav;
    }

    @RequestMapping("/buscarDisciplina")
    public ModelAndView buscarDisciplina(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaDisciplina");
        List<Disciplina> lista = disOad.findByDisciplinaContaining(cadena);
        mav.addObject("disciplina", lista);
        return mav;
    }
    
    @RequestMapping(value="/agregarDisciplinaF")
    public ModelAndView mostrarFormaAgregarDisciplina() {
        ModelAndView mav = new ModelAndView("formDisciplina");
        mav.addObject("disciplina", new Disciplina());
        return mav;
    }
    
    @RequestMapping(value="/agregarDisciplina", method = RequestMethod.POST)
    public String agregarDisciplina(@ModelAttribute("disciplina") Disciplina nuevoDisciplina) {
        disOad.save(nuevoDisciplina);
        return "redirect:/disciplinaadmin";
    }

    
    @RequestMapping("/predecirDisciplina")
    @ResponseBody
    public List<Disciplina> buscarDisciplinaComenzandoCon(@RequestParam("cadena") String cadena) {
        return disOad.findByDisciplinaStartingWith(cadena);
    }
}