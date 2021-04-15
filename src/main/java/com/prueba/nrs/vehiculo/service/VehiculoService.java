/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.nrs.vehiculo.service;

import com.prueba.nrs.vehiculo.entity.tbl_vehiculo;

/**
 *
 * @author USER
 */
public interface VehiculoService {
    
    java.util.List<tbl_vehiculo> getAllVehiculos();
    int updateVehiculos(int id);
    tbl_vehiculo saveVehiculo(tbl_vehiculo vehiculo);
    
}
