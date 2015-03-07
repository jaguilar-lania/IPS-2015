/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb.control;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import rysi.tesis.virtualmonkeyweb.Tesis;

/**
 *
 * @author Anny
 */
@Controller
public class ArchivosControlador {
    @RequestMapping("/SubirArchivo")
    public ModelAndView SubirArchivo(){
        ModelAndView mav = new ModelAndView("formArchivo");
        return mav;
    }
    
     @RequestMapping(value = "/subir", method = RequestMethod.POST)
    public String aceptarArchivo(@RequestParam("archivo") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                File archivoDestino = File.createTempFile("archivo", "pdf");
                file.transferTo(archivoDestino);
                return "redirect:/tesis";
            } catch (IOException ex) {
                Logger.getLogger(ArchivosControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "redirect:/subirArchivo";
    }
    
    
    
}
