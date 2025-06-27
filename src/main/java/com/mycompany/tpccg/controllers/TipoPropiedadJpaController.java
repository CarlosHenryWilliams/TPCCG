package com.mycompany.tpccg.controllers;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.dao.TipoPropiedadDAO;
import com.mycompany.tpccg.model.TipoPropiedad;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.io.Serializable;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

public class TipoPropiedadJpaController implements Serializable, TipoPropiedadDAO {
    
    private EntityManagerFactory emf = null;

    public TipoPropiedadJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public TipoPropiedadJpaController() {
        emf = Persistence.createEntityManagerFactory("PersistenceParcialPU");
    }

    @Override
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    public void create(TipoPropiedad tipoPropiedad) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoPropiedad);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void edit(TipoPropiedad tipoPropiedad) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoPropiedad = em.merge(tipoPropiedad);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tipoPropiedad.getIdTipoPropiedad();
                if (findTipoPropiedad(id) == null) {
                    throw new NonexistentEntityException("The tipoPropiedad with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoPropiedad tipoPropiedad;
            try {
                tipoPropiedad = em.getReference(TipoPropiedad.class, id);
                tipoPropiedad.getIdTipoPropiedad();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoPropiedad with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipoPropiedad);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    @Override
    public List<TipoPropiedad> findTipoPropiedadEntities() {
        return findTipoPropiedadEntities(true, -1, -1);
    }

    @Override
    public List<TipoPropiedad> findTipoPropiedadEntities(int maxResults, int firstResult) {
        return findTipoPropiedadEntities(false, maxResults, firstResult);
    }

    @Override
    public List<TipoPropiedad> findTipoPropiedadEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TipoPropiedad.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public TipoPropiedad findTipoPropiedad(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoPropiedad.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public int getTipoPropiedadCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TipoPropiedad> rt = cq.from(TipoPropiedad.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
