/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.nrs.vehiculo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author USER
 */
@Entity
public class tbl_tipo_combustible implements Serializable {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     
     private int id_tipo_combustible;
     private String descripcion;

    public tbl_tipo_combustible(int id_tipo_combustible, String descripcion) {
        this.id_tipo_combustible = id_tipo_combustible;
        this.descripcion = descripcion;
    }

    public int getId_tipo_combustible() {
        return id_tipo_combustible;
    }

    public void setId_tipo_combustible(int id_tipo_combustible) {
        this.id_tipo_combustible = id_tipo_combustible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
    
    
    
}
