/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ2026.practicas_omarchy.modelos;

/**
 *
 * @author victor
 */
public class Bateria {

    private String tamanio;
    private int capacidad;

    public Bateria(String tamanio, int capacidad) {
        this.tamanio = tamanio;
        this.capacidad = capacidad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
