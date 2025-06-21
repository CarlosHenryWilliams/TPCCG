package com.mycompany.tpccg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactura;
    @OneToOne
    private Propiedad propiedadAsig;
    @ManyToOne
    private Cliente compradorAsig;
    private Date fechaEmision;

    public Factura() {
    }

    public Factura(Propiedad propiedadAsig, Cliente compradorAsig, Date fechaEmision) {
        this.propiedadAsig = propiedadAsig;
        this.compradorAsig = compradorAsig;
        this.fechaEmision = fechaEmision;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Propiedad getPropiedadAsig() {
        return propiedadAsig;
    }

    public void setPropiedadAsig(Propiedad propiedadAsig) {
        this.propiedadAsig = propiedadAsig;
    }

    public Cliente getCompradorAsig() {
        return compradorAsig;
    }

    public void setCompradorAsig(Cliente compradorAsig) {
        this.compradorAsig = compradorAsig;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

}
