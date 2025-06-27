package com.mycompany.tpccg.dao;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.model.Cliente;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface ClienteDAO {

    public EntityManager getEntityManager();

    public void create(Cliente cliente);

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception;

    public void destroy(int id) throws NonexistentEntityException;

    public List<Cliente> findClienteEntities();

    public List<Cliente> findClienteEntities(int maxResults, int firstResult);
    
    public List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult);

    public Cliente findCliente(int id) ;
   
    public Cliente findClienteByDNI(String dni) ;

    public int getClienteCount();
}
