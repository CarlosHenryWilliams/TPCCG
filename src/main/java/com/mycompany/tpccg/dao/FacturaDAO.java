package com.mycompany.tpccg.dao;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.model.Factura;
import jakarta.persistence.EntityManager;
import java.util.List;

public interface FacturaDAO {
    
    public EntityManager getEntityManager();
    
    public void create(Factura factura);
    
    public void edit(Factura factura) throws NonexistentEntityException, Exception;
    
    public void destroy(int id)  throws NonexistentEntityException;
    
    public List<Factura> findFacturaEntities();
    
    public List<Factura> findFacturaEntities(int maxResults, int firstResult);
    
    public List<Factura> findFacturaEntities(boolean all, int maxResults, int firstResult);
    
    public Factura findFactura(int id);
    
    public int getFacturaCount();
}
