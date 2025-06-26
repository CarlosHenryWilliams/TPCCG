/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tpccg.dao;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.model.Cliente;
import jakarta.persistence.EntityManager;

import java.util.List;

/**
 *
 * @author CharlyW
 */
public interface ClienteDAO {

    public EntityManager getEntityManager();

    public void create(Cliente cliente);

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception;

    public void destroy(int id) throws NonexistentEntityException;

    public List<Cliente> findClienteEntities();

    public List<Cliente> findClienteEntities(int maxResults, int firstResult);

    public Cliente findCliente(int id) ;
   
   // Nuevo método para encontrar un cliente por DNI
    public Cliente findClienteByDNI(String dni) ;

    public int getClienteCount();
    
}
