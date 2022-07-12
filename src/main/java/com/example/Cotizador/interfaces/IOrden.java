/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Cotizador.interfaces;

import com.example.Cotizador.modelo.Orden;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Franc
 */
@Repository
public interface IOrden extends CrudRepository<Orden,Integer> {
    
}
