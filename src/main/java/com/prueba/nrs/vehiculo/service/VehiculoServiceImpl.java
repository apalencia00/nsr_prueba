/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.nrs.vehiculo.service;

import com.prueba.nrs.vehiculo.entity.tbl_vehiculo;
import com.prueba.nrs.vehiculo.repository.VehiculoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
@Transactional
public class VehiculoServiceImpl implements VehiculoService{
    
    @Autowired 
    VehiculoRepository vehiculoRepository;

    @Override
    public List<tbl_vehiculo> getAllVehiculos() {
        
       return vehiculoRepository.findAll();
        
    }

    

    @Override
    public tbl_vehiculo saveVehiculo(tbl_vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public int updateVehiculos(String vmarca, int tipo_v, String vcolor, int comb, int id) {
        vehiculoRepository.updateVehiculo(vmarca, tipo_v, vcolor, tipo_v, id, id);
        return 1;
    }
    
}
