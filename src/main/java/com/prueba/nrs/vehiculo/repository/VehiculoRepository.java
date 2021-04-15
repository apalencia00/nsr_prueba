/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.nrs.vehiculo.repository;

import com.prueba.nrs.vehiculo.entity.tbl_vehiculo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public interface VehiculoRepository extends CrudRepository<tbl_vehiculo, Integer>  {
    
    @Query(value ="SELECT * FROM tbl_vehiculo", nativeQuery = true)
    @Override
    public List<tbl_vehiculo>  findAll();
    
    @Query(value ="UPDATE tbl_vehiculo SET marca = ?1, tipo_vehiculo = ?2, color = ?3, tipo_combustible = ?4, antiguedad = ?5 WHERE id_vehiculo = ?6", nativeQuery = true)
    public void updateVehiculo(@Param("vmarca") String vmarca, @Param("vtipo_vehiculo") int vtipo_vehiculo, @Param("vcolor") String vcolor , @Param("vtipo_combustible") int vtipo_combustible, @Param("vantiguedad") int vantiguedad, @Param("vid_vehiculo") int vid_vehiculo );
}
