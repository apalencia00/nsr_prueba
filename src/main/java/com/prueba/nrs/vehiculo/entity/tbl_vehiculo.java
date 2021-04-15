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
public class tbl_vehiculo  implements Serializable{
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     
     private int id_vehiculo;
     private String marca;
     private int tipo_vehiculo;
     private String color;
     private int tipo_combustible;
     private int antiguedad;

    public tbl_vehiculo() {
    }
     
     

    public tbl_vehiculo(int id_vehiculo, String marca, int tipo_vehiculo, String color, int tipo_combustible, int antiguedad) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.tipo_vehiculo = tipo_vehiculo;
        this.color = color;
        this.tipo_combustible = tipo_combustible;
        this.antiguedad = antiguedad;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(int tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(int tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
     
     
}
