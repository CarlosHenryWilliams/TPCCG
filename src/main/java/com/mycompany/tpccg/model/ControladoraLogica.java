/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpccg.model;

import com.mycompany.tpccg.controllers.ControladoraControllers;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CharlyW
 */
public class ControladoraLogica {

    ControladoraControllers controlControllers = new ControladoraControllers();
   
    
    
    
    
    
    //Vender propiedad
    public void ventaPropiedad(Cliente cliente, Propiedad propiedad) {

        Factura factura = new Factura();
        factura.setFechaEmision(new Date());
        factura.setPropiedadAsig(propiedad);
        factura.setCompradorAsig(cliente);
     
        controlControllers.ventaPropiedad(factura);
        
    }

    public List<Propiedad> traerPropiedades() {
        
        return controlControllers.traerPropiedades();

    }



}
