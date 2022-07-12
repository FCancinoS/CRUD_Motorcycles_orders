/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Cotizador.modelo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Orden")
/**
 *
 * @author Franc
 */
public class Orden {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    
     private int id;


    private String modelo;
    private int version;
    @DateTimeFormat(pattern= "yyyy-MM-dd")
    private Date fecha;
    private int costoDesglosado;
    private int costoTotal;
    private int enganche;
    private int mensaulidades;
    private String nombre;
    private int celular;
    private String correo;

    public Orden(int id, String modelo, int version, Date fecha, int costoDesglosado, int costoTotal, int enganche, int mensaulidades, String nombre, int celular, String correo) {
        this.id = id;
        this.modelo = modelo;
        this.version = version;
        this.fecha = fecha;
        this.costoDesglosado = costoDesglosado;
        this.costoTotal = costoTotal;
        this.enganche = enganche;
        this.mensaulidades = mensaulidades;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
    }
    public Orden() {
 
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCostoDesglosado() {
        return costoDesglosado;
    }

    public void setCostoDesglosado(int costoDesglosado) {
        this.costoDesglosado = costoDesglosado;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getEnganche() {
        return enganche;
    }

    public void setEnganche(int enganche) {
        this.enganche = enganche;
    }

    public int getMensaulidades() {
        return mensaulidades;
    }

    public void setMensaulidades(int mensaulidades) {
        this.mensaulidades = mensaulidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
