package com.mycompany.tpccg.controllers;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.model.Cliente;
import com.mycompany.tpccg.model.Factura;
import com.mycompany.tpccg.model.Propiedad;
import com.mycompany.tpccg.model.TipoPropiedad;
import java.util.List;


public class ControladoraControllers {
    
    //ClienteJpaController clienteJPA = new ClienteJpaController();
    //PropiedadJpaController propiedadJPA = new PropiedadJpaController();
    //FacturaJpaController facturaJPA = new FacturaJpaController();
    //TipoPropiedadJpaController tipoPropiJPA = new TipoPropiedadJpaController();

    ClienteJpaController clienteJPA;
    PropiedadJpaController propiedadJPA;
    FacturaJpaController facturaJPA;
    TipoPropiedadJpaController tipoPropiJPA;

    // FACTURAS
    public void ventaPropiedad(Factura factura) {
        facturaJPA = new FacturaJpaController();
        facturaJPA.create(factura);
    }

    public List<Factura> traerFacturas() {
        facturaJPA = new FacturaJpaController();
        return facturaJPA.findFacturaEntities();
    }

    // PROPIEDADES
    public void venderPropiedadBooleanTrue(Propiedad propi) {
        propiedadJPA = new PropiedadJpaController();

        try {
            propiedadJPA.edit(propi);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al modificar el tipo de propiedad: " + ex.getMessage());
        }
    }

    public List<Propiedad> traerPropiedades() {
        propiedadJPA = new PropiedadJpaController();
        return propiedadJPA.findPropiedadEntities();
    }

    public void agregarPropiedad(Propiedad propiedad) {
        propiedadJPA = new PropiedadJpaController();
        propiedadJPA.create(propiedad);
    }

    public void borrarPropiedad(int idPropiedadSeleccionado) {
        propiedadJPA = new PropiedadJpaController();
        
        try {
            propiedadJPA.destroy(idPropiedadSeleccionado);
        } catch (NonexistentEntityException ex) {
            System.out.println("Ha ocurrio un error al eliminar la propiedad: " + ex.getMessage());
        }
    }

    public Propiedad traerPropiedad(int idPropiedad) {
        propiedadJPA = new PropiedadJpaController();
        return propiedadJPA.findPropiedad(idPropiedad);
    }

    public void modificarPropiedad(Propiedad propiedadAModificar) {
        propiedadJPA = new PropiedadJpaController();
        
        try {
            propiedadJPA.edit(propiedadAModificar);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al modificar la propiedad: " + ex.getMessage());
        }
    }

    // TIPO PROPIEDADES
    public List<TipoPropiedad> traerTipoPropiedades() {
        tipoPropiJPA = new TipoPropiedadJpaController();
        return tipoPropiJPA.findTipoPropiedadEntities();
    }

    public void agregarTipoPropiedad(TipoPropiedad tipoPropiedad) {
        tipoPropiJPA = new TipoPropiedadJpaController();
        tipoPropiJPA.create(tipoPropiedad);
    }

    public void borrarTipoPropiedad(int idTipoPropiedadSeleccionado) {
        tipoPropiJPA = new TipoPropiedadJpaController();
        
        try {
            tipoPropiJPA.destroy(idTipoPropiedadSeleccionado);
        } catch (NonexistentEntityException ex) {
            System.out.println("Ha ocurrido un error al eliminar el tipo de propiedad: " + ex.getMessage());
        }
    }

    public TipoPropiedad traerTipoPropiedad(int idTipoPropiedadQueLlega) {
        tipoPropiJPA = new TipoPropiedadJpaController();
        return tipoPropiJPA.findTipoPropiedad(idTipoPropiedadQueLlega);
    }

    public void ModificarTipoPropiedad(TipoPropiedad tipoPropiedad) {
        tipoPropiJPA = new TipoPropiedadJpaController();

        try {
            tipoPropiJPA.edit(tipoPropiedad);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al modificar el tipo de propiedad: " + ex.getMessage());
        }
    }

    public Cliente traerClientePorDNI(String dniIngresado) {
        clienteJPA = new ClienteJpaController();
        return clienteJPA.findClienteByDNI(dniIngresado);

    }
}
