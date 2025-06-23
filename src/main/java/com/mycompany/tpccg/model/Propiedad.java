/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpccg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

/**
 *
 * @author marti
 */
@Entity
public class Propiedad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPropiedad;
    private int ambientes;
    private String direccion;
    private Double precio;
    private Boolean vendida;
    @ManyToOne
    @JoinColumn(name="idTipoPropiedad")
    private TipoPropiedad tipoPropiedad; 

    public Propiedad() {
    }

    public Propiedad(int ambientes, String direccion, Double precio, Boolean vendida, TipoPropiedad tipoPropiedad) {
        this.ambientes = ambientes;
        this.direccion = direccion;
        this.precio = precio;
        this.vendida = vendida;
        this.tipoPropiedad = tipoPropiedad;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getVendida() {
        return vendida;
    }

    public void setVendida(Boolean vendida) {
        this.vendida = vendida;
    }

    public TipoPropiedad getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(TipoPropiedad tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

}
