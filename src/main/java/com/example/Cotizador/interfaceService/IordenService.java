/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Cotizador.interfaceService;

import com.example.Cotizador.modelo.Orden;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Franc
 */
public interface IordenService {
    public List<Orden>listar();
    public Optional<Orden>listarID(int id);
    public int save(Orden o);
    public void delete(int id);
}
