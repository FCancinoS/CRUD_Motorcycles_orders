/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Cotizador.controller;

import com.example.Cotizador.interfaceService.IordenService;
import com.example.Cotizador.modelo.Orden;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Franc
 */
@Controller
@RequestMapping

public class Controlador {
    @Autowired
    private IordenService service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Orden>ordenes = service.listar();
        model.addAttribute("ordenes", ordenes);
        return "index";
    }
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("orden", new Orden());
        return "form";
    }
    @PostMapping("/save")
    public String save(@Valid Orden o, Model model){
        service.save(o);
        return "redirect:/listar";
    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Orden>orden=service.listarID(id);
        model.addAttribute("orden", orden);
        return "form";
    }
    @GetMapping("/eliminar/{id}")
    public String delete(Model model,@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
