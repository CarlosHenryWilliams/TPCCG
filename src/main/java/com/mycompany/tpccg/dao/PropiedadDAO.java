package com.mycompany.tpccg.dao;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.model.Propiedad;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface PropiedadDAO {
    
    public EntityManager getEntityManager();
            
    public void create(Propiedad propiedad);

    public void edit(Propiedad propiedad) throws NonexistentEntityException, Exception;

    public void destroy(int id) throws NonexistentEntityException;

    public List<Propiedad> findPropiedadEntities();

    public List<Propiedad> findPropiedadEntities(int maxResults, int firstResult);

    public List<Propiedad> findPropiedadEntities(boolean all, int maxResults, int firstResult);

    public Propiedad findPropiedad(int id);

    public int getPropiedadCount();
}
