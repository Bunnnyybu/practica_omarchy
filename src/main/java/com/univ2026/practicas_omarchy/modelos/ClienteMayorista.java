/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ2026.practicas_omarchy.modelos;

/**
 *
 * @author victor
 */
public class ClienteMayorista extends Cliente {

    public ClienteMayorista(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularDescuento(double montoCompra) {
        return montoCompra * 0.20;
    }
}
