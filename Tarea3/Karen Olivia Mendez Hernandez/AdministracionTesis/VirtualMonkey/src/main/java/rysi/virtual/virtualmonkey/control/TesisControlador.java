/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.virtual.virtualmonkey.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import rysi.virtual.virtualmonkey.Catalogotesis;
import rysi.virtual.virtualmonkey.Disciplina;
import rysi.virtual.virtualmonkey.oad.TesisOad;

/**
 *
 * @author user
 */
@Controller
public class TesisControlador {
    
     @Autowired
     TesisOad artsOad;

    @RequestMapping("/tesis")
    public ModelAndView listarTesis() {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Catalogotesis> lista = artsOad.findAll();
        mav.addObject("tesis", lista);
        return mav;
    }
@RequestMapping("/buscarTesis")
    public ModelAndView buscarTesis(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Catalogotesis> lista = artsOad.findByTituloContaining(cadena);
        mav.addObject("tesis", lista);
        return mav;
    }
    
    @RequestMapping("/editarTesis")
    public ModelAndView editarTesis(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("editarTesis");
        List<Catalogotesis> lista = artsOad.findByTituloContaining(cadena);
        mav.addObject("tesis", lista);
        return mav;
    }

    
    @RequestMapping("/predecirTesis")
    @ResponseBody
    public List<Catalogotesis> buscarTesisComenzandoCon(@RequestParam("cadena") String cadena) {
        return artsOad.findByTituloStartingWith(cadena);
    }
    
    @RequestMapping("/eliminar")
    public ModelAndView eliminarTesis(@RequestParam("idtesis") Integer idtesis) { 
        System.out.println(idtesis);
        ModelAndView mav = new ModelAndView("confirmacion"); 
        artsOad.delete(idtesis);
        return mav;
    }
    
    @RequestMapping("/regresar")
    public ModelAndView regresar() { 
        ModelAndView mav = new ModelAndView("listaTesis"); 
        return mav;
    }
    
    @RequestMapping("/salir")
    public ModelAndView salir() { 
        ModelAndView mav = new ModelAndView("salir"); 
        return mav;
    }
    
    
    
 @RequestMapping("/registrar")
    public ModelAndView registrar() { 
        ModelAndView mav = new ModelAndView("registrarTesis"); 
        return mav;
    }
    
    @RequestMapping("/registrarTesis")
    public ModelAndView registrarTesis(@RequestParam("titulo") String titulo,@RequestParam("autor") String autor,
            @RequestParam("especie") String especie, @RequestParam("disciplina") String disciplina,
            @RequestParam("subdisciplina") String subdisciplina,@RequestParam("condicion") String condicion,
            @RequestParam("anio") String anio,@RequestParam("grado") String grado, @RequestParam("archivo") String archivo,
            @RequestParam("institucion") String institucion, @RequestParam("director") String director, @RequestParam("estado") String estado) { 
        
        ModelAndView mav = new ModelAndView("confirmacionRegistro"); 
        Catalogotesis cat1 = new Catalogotesis();
        
        cat1.setTitulo(titulo);
        cat1.setAutor(autor);
        cat1.setEspecie(especie);
        cat1.setDisciplina(disciplina);
        cat1.setSubdisciplina(subdisciplina);
        cat1.setCondicion(condicion);
        cat1.setGrado(grado);
        cat1.setAnio(anio);
        cat1.setInstitucion(institucion);
        cat1.setDirector(director);
        cat1.setEstado(estado);
        cat1.setArchivo(archivo);
        artsOad.save(cat1);
        
        return mav;
    }
    
 
    
}
