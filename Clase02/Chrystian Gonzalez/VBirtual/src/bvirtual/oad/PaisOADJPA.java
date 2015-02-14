/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bvirtual.oad;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import bvirtual.entidades.MdTesis;
/**
 *
 * @author Chrys
 */
public class PaisOADJPA implements PaisOAD{
    
    private EntityManagerFactory emf;
    
    public PaisOADJPA() {
        emf = Persistence.createEntityManagerFactory("ArticulosDatosPU");
    }
    
    
}
