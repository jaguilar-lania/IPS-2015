/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ips.lania.dao;

import java.util.List;

/**
 *
 * @author Frost
 */
public interface CrudDAO <T>{
    
    public abstract boolean create(T o);
    public abstract boolean update(T o);
    public abstract boolean delete(T o);
    public abstract T getElement(Integer id);
    public abstract List<T> getElements(String ids);
    public abstract long countElements();
    
}
