/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inecolprime.dao;

import java.util.List;

/**
 *
 * @author Frost
 */
public interface CrudDAO {
    
    public abstract boolean create(Object o);
    public abstract boolean update(Object o);
    public abstract boolean delete(Object o);
    public abstract Object getElement(Integer id);
    public abstract List<Object> getElements(String ids);
    public abstract long countElements();
    
}
