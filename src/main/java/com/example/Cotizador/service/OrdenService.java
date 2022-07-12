/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Cotizador.service;


import com.example.Cotizador.interfaceService.IordenService;
import com.example.Cotizador.modelo.Orden;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Cotizador.interfaces.IOrden;
import org.springframework.stereotype.Service;
/**
 *
 * @author Franc
 */
@Service
public class OrdenService implements IordenService {
    @Autowired
    private IOrden data;
    @Override
    public List<Orden> listar() {
        return (List<Orden>)data.findAll();
    }

    @Override
    public Optional<Orden> listarID(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Orden o) {
      int res=0;
      Orden orden = data.save(o);
      if(!orden.equals(null)){
          res=1;
      }
      return 0;
    }

    @Override
    public void delete(int id) {
        
        data.deleteById(id);
    }
    
}
