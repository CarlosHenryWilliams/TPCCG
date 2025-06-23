/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpccg.controllers;

import com.mycompany.tpccg.model.Cliente;
import com.mycompany.tpccg.model.Factura;
import com.mycompany.tpccg.model.Propiedad;
import com.mycompany.tpccg.model.TipoPropiedad;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CharlyW
 */
public class ControladoraControllers {

    ClienteJpaController clienteJPA = new ClienteJpaController();
    PropiedadJpaController propiedadJPA = new PropiedadJpaController();
    FacturaJpaController facturaJPA = new FacturaJpaController();
    TipoPropiedadJpaController tipoPropiJPA = new TipoPropiedadJpaController();

    public void ventaPropiedad(Factura factura) {
        facturaJPA.create(factura);
    }

    // PROPIEDADES
    public List<Propiedad> traerPropiedades() {
        return propiedadJPA.findPropiedadEntities();
    }

    public void agregarPropiedad(Propiedad propiedad) {
        propiedadJPA.create(propiedad);
    }

    // FACTURAS
    public List<Factura> traerFacturas() {
        return facturaJPA.findFacturaEntities();
    }

    public List<TipoPropiedad> traerTipoPropiedades() {
        return tipoPropiJPA.findTipoPropiedadEntities();
    }

}
