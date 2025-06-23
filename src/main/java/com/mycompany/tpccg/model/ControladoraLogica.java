package com.mycompany.tpccg.model;

import com.mycompany.tpccg.controllers.ControladoraControllers;
import java.util.Date;
import java.util.List;

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

    public List<Factura> traerFacturas() {
        return controlControllers.traerFacturas();
    }

    //Tiipo Propiedades
    public List<TipoPropiedad> traerTipoPropiedades() {
        return controlControllers.traerTipoPropiedades();
    }

    // METODOS PROPIEDADES
    public List<Propiedad> traerPropiedades() {
        return controlControllers.traerPropiedades();
    }

    public Propiedad traerPropiedad(int idPropiedad) {
        return controlControllers.traerPropiedad(idPropiedad);
    }

    public void agregarPropiedad(String direccionCasa, TipoPropiedad tipoPropiedadCasa, int cantAmbientesCasa, Double precioCasa) {
        Propiedad propiedad = new Propiedad();

        propiedad.setDireccion(direccionCasa);
        propiedad.setTipoPropiedad(tipoPropiedadCasa);
        propiedad.setAmbientes(cantAmbientesCasa);
        propiedad.setPrecio(precioCasa);
        propiedad.setVendida(Boolean.FALSE);

        controlControllers.agregarPropiedad(propiedad);

    }

    public void modificarPropiedad(int idPropiedad, String direccionCasa, TipoPropiedad tipoPropiedadCasa, int cantAmbientesCasa, Double precioCasa) {
        Propiedad propiedadAModificar = traerPropiedad(idPropiedad);
        propiedadAModificar.setDireccion(direccionCasa);
        propiedadAModificar.setTipoPropiedad(tipoPropiedadCasa);
        propiedadAModificar.setAmbientes(cantAmbientesCasa);
        propiedadAModificar.setPrecio(precioCasa);

        controlControllers.modificarPropiedad(propiedadAModificar);
    }

    public void borrarPropiedad(int idPropiedadSeleccionado) {
        controlControllers.borrarPropiedad(idPropiedadSeleccionado);
    }

    public void agregarTipoPropiedad(String tipoPropiedadDescripcion) {
        TipoPropiedad tipoPropiedad = new TipoPropiedad();
        tipoPropiedad.setDescripcion(tipoPropiedadDescripcion);
        
        controlControllers.agregarTipoPropiedad(tipoPropiedad);
    }

    public void borrarTipoPropiedad(int idTipoPropiedadSeleccionado) {
        controlControllers.borrarTipoPropiedad(idTipoPropiedadSeleccionado);
    }

    public TipoPropiedad traerTipoPropiedad(int idTipoPropiedadQueLlega) {
        return controlControllers.traerTipoPropiedad(idTipoPropiedadQueLlega);
    }

    public void modificarTipoPropiedad(int idTipoPropiedad, String tipoPropiedadDesc) {
        TipoPropiedad tipoPropiedad = traerTipoPropiedad(idTipoPropiedad);
        tipoPropiedad.setDescripcion(tipoPropiedadDesc);
        controlControllers.ModificarTipoPropiedad(tipoPropiedad);
    }

}
