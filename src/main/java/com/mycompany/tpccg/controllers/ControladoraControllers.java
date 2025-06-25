package com.mycompany.tpccg.controllers;

import com.mycompany.tpccg.controllers.exceptions.NonexistentEntityException;
import com.mycompany.tpccg.model.Cliente;
import com.mycompany.tpccg.model.Factura;
import com.mycompany.tpccg.model.Propiedad;
import com.mycompany.tpccg.model.TipoPropiedad;
import java.util.List;


public class ControladoraControllers {

    ClienteJpaController clienteJPA = new ClienteJpaController();
    PropiedadJpaController propiedadJPA = new PropiedadJpaController();
    FacturaJpaController facturaJPA = new FacturaJpaController();
    TipoPropiedadJpaController tipoPropiJPA = new TipoPropiedadJpaController();

    // FACTURAS
    public void ventaPropiedad(Factura factura) {
        facturaJPA.create(factura);
    }

    public List<Factura> traerFacturas() {
        return facturaJPA.findFacturaEntities();
    }

    // PROPIEDADES
    public void venderPropiedadBooleanTrue(Propiedad propi) {
        try {
            propiedadJPA.edit(propi);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al modificar el tipo de propiedad: " + ex.getMessage());
        }
    }

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

    public TipoPropiedad traerTipoPropiedad(int idTipoPropiedadQueLlega) {
        return tipoPropiJPA.findTipoPropiedad(idTipoPropiedadQueLlega);
    }

    public void ModificarTipoPropiedad(TipoPropiedad tipoPropiedad) {

        try {
            tipoPropiJPA.edit(tipoPropiedad);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al modificar el tipo de propiedad: " + ex.getMessage());
        }
    }

    public Cliente traerClientePorDNI(String dniIngresado) {

        return clienteJPA.findClienteByDNI(dniIngresado);

    }
}
