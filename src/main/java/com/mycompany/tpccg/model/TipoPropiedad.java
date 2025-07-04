package com.mycompany.tpccg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class TipoPropiedad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPropiedad;
    private String descripcion;

    public TipoPropiedad() {
    }

    public TipoPropiedad(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTipoPropiedad() {
        return idTipoPropiedad;
    }

    public void setIdTipoPropiedad(int idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoPropiedad{" + "idTipoPropiedad=" + idTipoPropiedad + ", descripcion=" + descripcion + '}';
    }

}
