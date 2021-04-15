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
    
   
}
