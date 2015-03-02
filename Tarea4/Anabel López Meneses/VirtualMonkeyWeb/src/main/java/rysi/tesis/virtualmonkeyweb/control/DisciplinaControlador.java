/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.tesis.virtualmonkeyweb.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rysi.tesis.virtualmonkeyweb.Disciplinaestudio;
import rysi.tesis.virtualmonkeyweb.dao.DisciplinaDao;

/**
 *
 * @author Anny
 */
public class DisciplinaControlador {
     @Autowired
     DisciplinaDao disciplinaDao;
    
        
    @RequestMapping("/disciplina")
    public ModelAndView listarDisciplina(){
        
        ModelAndView mav = new ModelAndView("admonDisciplinas");
        List<Disciplinaestudio> lista = disciplinaDao.findAll();
                 
        mav.addObject("disciplinas", lista);
        return mav;
    
    }
    
    @RequestMapping("/filtrarDisciplinas")
    public ModelAndView buscarDisciplinas(@RequestParam("cadena") String cadena){
        ModelAndView mav = new ModelAndView("admonDisciplinas");
        List<Disciplinaestudio> lista = disciplinaDao.findByNombreContaining(cadena);
       
        
        mav.addObject("disciplinas", lista);
        return mav;
    }
    
       
    @RequestMapping("/guardarDisciplina")
    public ModelAndView agregarTesis(@RequestParam("nombre") String Nombre){
                
            Disciplinaestudio disciplina1 = new Disciplinaestudio();
            disciplina1.setNombre(Nombre);
            
            disciplinaDao.save(disciplina1);
                   
            return listarDisciplina();
            
    }
    
    @RequestMapping("/modificarDisciplina")
    public ModelAndView modificarDisciplina(@RequestParam("idDisciplina") Integer IdDisciplina,
            @RequestParam("nombre") String Nombre){
        
            //es modificar tesis
            Disciplinaestudio disciplina1 = disciplinaDao.findOne(IdDisciplina);
            disciplina1.setNombre(Nombre);
            disciplinaDao.save(disciplina1);
          return listarDisciplina();
            
    }
    
    
    @RequestMapping("/eliminarDisciplina")
    public ModelAndView eliminarDisciplina(@RequestParam("idDisciplina") Integer idTesis){
        disciplinaDao.delete(idTesis);
        return listarDisciplina();
    }
    
    @RequestMapping("/buscarDisciplinaPorId")
    public ModelAndView buscarDisciplinaPorId(@RequestParam("idDisciplina") Integer IdDisciplina){
        ModelAndView mav = new ModelAndView("editaDisciplina" );
        Disciplinaestudio tesisDao1 = disciplinaDao.findOne(IdDisciplina);
        
        mav.addObject("disciplinaId", tesisDao1);
        return mav;
    }
    
        
}
