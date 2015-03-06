/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.control;

import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.DisciplinaOad;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.EspecieOad;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.EstadoOad;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.InstitucionAdscripcionOad;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.SubdisciplinaOad;
import lania.rysy.ips2015.bibliotecavirtualweb.dao.TesisOad;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Disciplina;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Especie;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.InstitucionAdscripcion;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Estado;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Subdisciplina;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Tesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author miguel
 */
@Controller
public class TesisControlador {
    
    
    @Autowired
    TesisOad tesisOad ;
     
    @Autowired
    EstadoOad estadoOad;
    
    
    @Autowired
    EspecieOad especieOad;
    
    @Autowired
    InstitucionAdscripcionOad institucionOad;
    
    @Autowired
    DisciplinaOad disciplinaOad;
    
    @Autowired
    SubdisciplinaOad subDisciplinaOad;
    
    
    
    @RequestMapping("/tesis")
    public ModelAndView listarTesis(){
        ModelAndView mav = new ModelAndView("listarTesis");
        List<Tesis> lista = tesisOad.findAll();
        List<Especie> listaEsp = especieOad.findAll();
        List<Estado> listaEst = estadoOad.findAll();
        List<InstitucionAdscripcion> listaIns = institucionOad.findAll();
        List<Disciplina> listaDis = disciplinaOad.findAll();
        List<Subdisciplina> listaSub = subDisciplinaOad.findAll();
       
        Map<String,String> especie = new LinkedHashMap<String,String>();
        for (Especie doc : listaEsp){
            especie.put(doc.getIdespecie().toString(), doc.getNombre());
        }
        mav.addObject("especie", especie);
        Map<String,String> institucion = new LinkedHashMap<String,String>();
        for (InstitucionAdscripcion doc : listaIns){
            institucion.put(doc.getIdinstitucionAdscripcion().toString(), doc.getNombre());
	
        }
        mav.addObject("institucionadscripcion", institucion);
           
        Map<String,String> estados = new LinkedHashMap<String,String>();
        for (Estado doc : listaEst){
            estados.put(doc.getIdestado().toString(), doc.getNombre());
        }
        mav.addObject("estados", estados);
        
        Collections.sort(listaDis, new Comparator<Disciplina>(){
        public int compare(Disciplina s1, Disciplina s2) {
            return s1.getDisciplina().compareToIgnoreCase(s2.getDisciplina());
        }
        });
        
        Map<String,String> disciplinas = new LinkedHashMap<String,String>();
        for (Disciplina doc : listaDis){
            disciplinas.put(doc.getIddisciplina().toString(), doc.getDisciplina());
        }
        mav.addObject("disciplinas", disciplinas);
         Map<String,String> subdisciplinas = new LinkedHashMap<String,String>();
        for (Subdisciplina doc : listaSub){
            subdisciplinas.put(doc.getIdsubdisciplina().toString(), doc.getNombre());
        }
        mav.addObject("subdisciplinas", subdisciplinas);
        mav.addObject("tesisEnt", new Tesis());
        mav.addObject("tesis", lista);
        return mav;
    }
    
     @RequestMapping("/buscarTesis")
    public ModelAndView buscarTesis(@RequestParam("cadena") String cadena) {
        ModelAndView mav = new ModelAndView("listarTesis");
        List<Tesis> lista = tesisOad.findBytituloContaining(cadena.toUpperCase());
        List<Especie> listaEsp = especieOad.findAll();
        List<Estado> listaEst = estadoOad.findAll();
        List<InstitucionAdscripcion> listaIns = institucionOad.findAll();
        List<Disciplina> listaDis = disciplinaOad.findAll();
        List<Subdisciplina> listaSub = subDisciplinaOad.findAll();
        
         Map<String,String> especie = new LinkedHashMap<String,String>();
        for (Especie doc : listaEsp){
            especie.put(doc.getIdespecie().toString(), doc.getNombre());
        }
        mav.addObject("especie", especie);
        
        Map<String,String> institucion = new LinkedHashMap<String,String>();
        for (InstitucionAdscripcion doc : listaIns){
            institucion.put(doc.getIdinstitucionAdscripcion().toString(), doc.getNombre());
	
        }
         mav.addObject("institucionadscripcion", institucion);
           
        Map<String,String> estados = new LinkedHashMap<String,String>();
        for (Estado doc : listaEst){
            estados.put(doc.getIdestado().toString(), doc.getNombre());
        }
        mav.addObject("estados", estados);
        Map<String,String> disciplinas = new LinkedHashMap<String,String>();
        for (Disciplina doc : listaDis){
            disciplinas.put(doc.getIddisciplina().toString(), doc.getDisciplina());
        }
        mav.addObject("disciplinas", disciplinas);
         Map<String,String> subdisciplinas = new LinkedHashMap<String,String>();
        for (Subdisciplina doc : listaSub){
            subdisciplinas.put(doc.getIdsubdisciplina().toString(), doc.getNombre());
        }
        mav.addObject("subdisciplinas", subdisciplinas);
        mav.addObject("tesisEnt", new Tesis());
        mav.addObject("tesis", lista);
        return mav;
    }
    
    @RequestMapping(value="/agregarTesis", method = RequestMethod.POST)
    public String agregarTesis(@Valid @ModelAttribute("tesisEnt") Tesis nuevaTesis, BindingResult resultado) {
        try{
             nuevaTesis.setFechaReg(new Date());
            if (resultado.hasErrors()) {
               
                return "listarTesis";
            }
//            if(nuevaTesis.getArchivoTesis() == null)
//                nuevaTesis.setArchivoTesis(Blob.class.newInstance());
            tesisOad.save(nuevaTesis);
        }catch(Exception e)
        {
            System.out.println("Error- " + e.getMessage());
        }
        return "redirect:/tesis";
    }
    
    @RequestMapping(value="/borrarTesis")
    public String borrarTesis(@RequestParam("idtesis") int idtesis  ) {
        try{
            tesisOad.delete(idtesis);
            //tesisOad.save(nuevaTesis);
        }catch(Exception e)
        {
            System.out.println("Error- " + e.getMessage());
        }
        return "redirect:/tesis";
    }
    
    
    
     @RequestMapping(value="/editarTesis")
    public ModelAndView editarTesis(@RequestParam("idtesis") int idtesis  ) {
        ModelAndView mav = new ModelAndView("listarTesis");
        Tesis tesisEnt = tesisOad.findOne(idtesis);
        List<Tesis> lista = tesisOad.findAll();
        List<Especie> listaEsp = especieOad.findAll();
        List<Estado> listaEst = estadoOad.findAll();
        
        
        List<InstitucionAdscripcion> listaIns = institucionOad.findAll();
        List<Disciplina> listaDis = disciplinaOad.findAll();
        List<Subdisciplina> listaSub = subDisciplinaOad.findAll();
        
         Map<String,String> especie = new LinkedHashMap<String,String>();
        for (Especie doc : listaEsp){
            especie.put(doc.getIdespecie().toString(), doc.getNombre());
        }
        mav.addObject("especie", especie);
        
        Map<String,String> institucion = new LinkedHashMap<String,String>();
        for (InstitucionAdscripcion doc : listaIns){
            institucion.put(doc.getIdinstitucionAdscripcion().toString(), doc.getNombre());
	
        }
         mav.addObject("institucionadscripcion", institucion);
           
        Map<String,String> estados = new LinkedHashMap<String,String>();
        for (Estado doc : listaEst){
            estados.put(doc.getIdestado().toString(), doc.getNombre());
        }
        mav.addObject("estados", estados);
        Map<String,String> disciplinas = new LinkedHashMap<String,String>();
        for (Disciplina doc : listaDis){
            disciplinas.put(doc.getIddisciplina().toString(), doc.getDisciplina());
        }
        mav.addObject("disciplinas", disciplinas);
         Map<String,String> subdisciplinas = new LinkedHashMap<String,String>();
        for (Subdisciplina doc : listaSub){
            subdisciplinas.put(doc.getIdsubdisciplina().toString(), doc.getNombre());
        }
        mav.addObject("subdisciplinas", subdisciplinas);
        mav.addObject("tesisEnt", tesisEnt);
        mav.addObject("tesis", lista);
        return mav;
    }
    
    
   
   
   
    
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String showHomePage(@ModelAttribute("Especie") Especie especie, BindingResult result, ModelMap model) {
//
//        List<Especie> lista = especieOad.findAll();
////        countryBeanList.add(new CountryBean("US", "United Stated"));
////        countryBeanList.add(new CountryBean("CHINA", "China"));
////        countryBeanList.add(new CountryBean("SG", "Singapore"));
////        countryBeanList.add(new CountryBean("MY", "Malaysia"));
//
//        model.addAttribute("countryBeanList", lista);
//        return "tesis";
//    }
    

    
//     @RequestMapping(value="/phone-options-page")  
//    private ModelAndView optionsTag() {  
//        ModelAndView mav = new ModelAndView("listarTesis");  
//          List<Estado> lista = estadoOad.findAll();
//       
//        mav.addObject("phonesMap", lista);  
//        mav.addObject("smartphone", new Estado());  
//          
//        return mav;  
//    }  
    

    
//    @RequestMapping("/buscarArticulos")
//    public ModelAndView buscarArticulos(@RequestParam("cadena") String cadena) {
//        ModelAndView mav = new ModelAndView("listaArticulos");
//        List<Tesis> lista = tesisOad.findByNombreContaining(cadena);
//        mav.addObject("articulos", lista);
//        return mav;
//    }
//
//    
//    @RequestMapping("/predecirArticulos")
//    @ResponseBody
//    public List<Tesis> buscarArticulosComenzandoCon(@RequestParam("cadena") String cadena) {
//        return tesisOad.findByNombreStartingWith(cadena);
//    }
}
