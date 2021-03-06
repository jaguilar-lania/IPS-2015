/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.monky.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import tesis.monky.entidades.Disciplina;
import tesis.monky.entidades.Tesis;
import tesis.monky.entidades.Usuario;
import tesis.monky.oad.DisciplinaOad;
import tesis.monky.oad.TesisOad;
import tesis.monky.oad.UsuarioOad;

/**
 *
 * @author Chrys
 */

@Controller

public class TesisControlador {
    
    @Autowired
    TesisOad tesOad;
    
    @Autowired
    UsuarioOad usOad;
    
    @Autowired
    DisciplinaOad disOad;

    @RequestMapping("/tesis")
    public ModelAndView listarDisciplina() {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Tesis> lista = tesOad.findAll();
        mav.addObject("tesis", lista);
        return mav;
    }

    @RequestMapping("/buscarTesis")
    public ModelAndView buscarDisciplina(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaTesis");
        List<Tesis> lista = tesOad.findByTituloContaining(cadena);
        mav.addObject("tesis", lista);
        return mav;
    }
    
    @RequestMapping("/agregarTesisF")
    public ModelAndView mostrarFormaAgregarDisciplina() {
        ModelAndView mav = new ModelAndView("formTesis");
        mav.addObject("tesis", new Tesis());
        
        
        List<Usuario> usuarioLista = usOad.findAll();
        Map<String, String> usuario = new HashMap<>();
        for(Usuario usu : usuarioLista){
            usuario.put(usu.getIdUsuario().toString(),usu.getNombre());
        }
        mav.addObject("listaUsuario", usuario);
        
        List<Disciplina> disciplinaLista = disOad.findAll();
        Map<String, String> disciplina = new HashMap<>();
        for(Disciplina dis : disciplinaLista){
            usuario.put(dis.getIdDisciplina().toString(),dis.getDescripcion());
        }
        mav.addObject("listaDisciplina",disciplina);
        
        
        return mav;
    }
    
    @RequestMapping("/editarTesisF")
    public ModelAndView mostrarFormaAgregarDisciplina(@RequestParam("id") Integer id) {
        ModelAndView mav = new ModelAndView("formTesis");
        mav.addObject("tesis", tesOad.findOne(id));
        return mav;
    }
    
    
    @RequestMapping(value="/agregarTesis", method = RequestMethod.POST)
    public String agregarArticulo(@Valid @ModelAttribute("tesis") Tesis dis, BindingResult resultado) {
        if (resultado.hasErrors()) {
            return "formTesis";
        }
        tesOad.save(dis);
        return "redirect:/tesis";
    }
    
}
