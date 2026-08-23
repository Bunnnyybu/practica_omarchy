/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ2026.practicas_omarchy.modelos;

/**
 *
 * @author victor
 */
public class Automovil extends Vehiculo {

    private int numPuertas;
    private Bateria bateria;

    public Automovil(String marca, String modelo, double precio,
                     int numPuertas, Bateria bateria) {

        super(marca, modelo, precio);
        this.numPuertas = numPuertas;
        this.bateria = bateria;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Bateria getBateria() {
        return bateria;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Numero de puertas: " + numPuertas);
        System.out.println("Bateria: " + bateria.getTamanio());
        System.out.println("Capacidad: " + bateria.getCapacidad());
    }
}
