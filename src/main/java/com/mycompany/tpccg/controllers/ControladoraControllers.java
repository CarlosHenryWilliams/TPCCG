/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpccg.controllers;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.model.Cliente;
import com.mycompany.tpccg.model.Factura;
import com.mycompany.tpccg.model.Propiedad;
import com.mycompany.tpccg.model.TipoPropiedad;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void borrarPropiedad(int idPropiedadSeleccionado) {
        try {
            propiedadJPA.destroy(idPropiedadSeleccionado);
        } catch (NonexistentEntityException ex) {
            System.out.println("Ha ocurrio un error al eliminar la propiedad: " + ex.getMessage());
        }
    }

    public Propiedad traerPropiedad(int idPropiedad) {
        return propiedadJPA.findPropiedad(idPropiedad);
    }

    public void modificarPropiedad(Propiedad propiedadAModificar) {
        try {
            propiedadJPA.edit(propiedadAModificar);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al modificar la propiedad: " + ex.getMessage());
        }
    }

    // FACTURAS
    public List<Factura> traerFacturas() {
        return facturaJPA.findFacturaEntities();
    }

    // TIPO PROPIEDADES
    public List<TipoPropiedad> traerTipoPropiedades() {
        return tipoPropiJPA.findTipoPropiedadEntities();
    }

    public void agregarTipoPropiedad(TipoPropiedad tipoPropiedad) {
        tipoPropiJPA.create(tipoPropiedad);
    }

    public void borrarTipoPropiedad(int idTipoPropiedadSeleccionado) {
        try {
            tipoPropiJPA.destroy(idTipoPropiedadSeleccionado);
        } catch (NonexistentEntityException ex) {
            System.out.println("Ha ocurrido un error al eliminar el tipo de propiedad: " + ex.getMessage());
        }
    }

}
