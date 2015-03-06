package rysi.virtual.virtualmonkey.control;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author 
 */
@Controller
public class ArchivoControlador {

    @RequestMapping(value = "/subir", method = RequestMethod.POST)
    public String aceptarArchivo(@RequestParam("archivo") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                File archivoDestino = File.createTempFile("archivo", "pdf");
                file.transferTo(archivoDestino);
                return "redirect:/tesis";
            } catch (IOException ex) {
                Logger.getLogger(ArchivoControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "redirect:/subirTesis";
    }
    
    
}