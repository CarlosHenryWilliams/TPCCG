package com.mycompany.tpccg.dao;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.model.TipoPropiedad;
import jakarta.persistence.EntityManager;
import java.util.List;

public interface TipoPropiedadDAO {
    
    public EntityManager getEntityManager();

    public void create(TipoPropiedad tipoPropiedad);

    public void edit(TipoPropiedad tipoPropiedad) throws NonexistentEntityException, Exception;

    public void destroy(int id) throws NonexistentEntityException;

    public List<TipoPropiedad> findTipoPropiedadEntities();
            
    public List<TipoPropiedad> findTipoPropiedadEntities(int maxResults, int firstResult);

    public List<TipoPropiedad> findTipoPropiedadEntities(boolean all, int maxResults, int firstResult);

    public TipoPropiedad findTipoPropiedad(int id);

    public int getTipoPropiedadCount();
}
