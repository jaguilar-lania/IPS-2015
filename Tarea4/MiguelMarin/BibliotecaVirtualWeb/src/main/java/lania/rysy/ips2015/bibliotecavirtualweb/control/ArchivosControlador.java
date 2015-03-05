package lania.rysy.ips2015.bibliotecavirtualweb.control;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Miguel
 */
@Controller
public class ArchivosControlador {

    @RequestMapping(value = "/subir", method = RequestMethod.POST)
    public String subirArchivo(@RequestParam("archivo") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                File archivoDestino = File.createTempFile("archivo", "pdf");
                file.transferTo(archivoDestino);
                
            } catch (IOException ex) {
                Logger.getLogger(ArchivosControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "redirect:/subirArchivo";
    }
}
