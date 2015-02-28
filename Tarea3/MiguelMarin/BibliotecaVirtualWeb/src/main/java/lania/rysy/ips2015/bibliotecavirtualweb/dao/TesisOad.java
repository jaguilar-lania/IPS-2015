/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lania.rysy.ips2015.bibliotecavirtualweb.dao;

import java.util.List;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Tesis;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author miguel
 */
public interface TesisOad extends JpaRepository<Tesis,Integer> {

    public List<Tesis> findBytituloContaining(String cadena);
    
}
