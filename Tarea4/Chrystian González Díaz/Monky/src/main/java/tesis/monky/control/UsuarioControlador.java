/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesis.monky.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import tesis.monky.entidades.Usuario;
import tesis.monky.oad.UsuarioOad;

/**
 *
 * @author Chrys
 */
@Controller
public class UsuarioControlador {
    
    @Autowired
    UsuarioOad usuOad;
    
    @RequestMapping("/buscarUsuario")
    public ModelAndView buscarDisciplina(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listaDisciplinas");
        List<Usuario> lista = usuOad.findAll();
        mav.addObject("usuarios", lista);
        return mav;
    }
    
}
