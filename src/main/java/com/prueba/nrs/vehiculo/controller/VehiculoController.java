/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.nrs.vehiculo.controller;

import com.prueba.nrs.vehiculo.entity.tbl_vehiculo;
import com.prueba.nrs.vehiculo.service.VehiculoService;
import java.util.List;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER
 */

@RestController
@RequestMapping("/api/nsr")

public class VehiculoController {
    
        @Autowired
        VehiculoService vehiculoService;
        
        @GetMapping(value ="hola")
        public String index(){
            return  "Hola Mundo!";
        }
        
        @GetMapping(value = "/all")
        public List<tbl_vehiculo> listAllVehiculos(){
            return vehiculoService.getAllVehiculos();
        }
        
        
        @PostMapping(path="/add") // Map ONLY POST Requests
        public @ResponseBody String addNewVehiculo (@RequestParam String marca
            , @RequestParam int tipo_v, @RequestParam String color, @RequestParam int tipo_comb, @RequestParam int antiguedad ) {


            tbl_vehiculo n = new tbl_vehiculo();
            n.setMarca(marca);
            n.setTipo_vehiculo(tipo_v);
            n.setColor(color);
            n.setTipo_combustible(tipo_comb);
            n.setAntiguedad(antiguedad);
            
            vehiculoService.saveVehiculo(n);
            
            return "Saved";
        }
        
        @PutMapping(path="/update")
        public @ResponseBody String updateVehiculo(@RequestParam String marca
            , @RequestParam int tipo_v, @RequestParam String color, @RequestParam int tipo_comb, @RequestParam int antiguedad, @RequestParam int id ){
            
            
            vehiculoService.updateVehiculos(marca, tipo_v, color, tipo_comb, antiguedad, id);
            
            return "Updated";
            
        }
        
        
        @DeleteMapping(path="/delete")
        public @ResponseBody String deleteVehiculo(@RequestParam int id){
            
            vehiculoService.deleteVehiculo(id);
            return "Deleted";
            
        }
        
        
    
    
}
