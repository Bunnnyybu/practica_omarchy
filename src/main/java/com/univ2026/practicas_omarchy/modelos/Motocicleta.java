/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ2026.practicas_omarchy.modelos;

/**
 *
 * @author victor
 */
public class Motocicleta extends Vehiculo {

    private int cilindrada;
    private Bateria bateria;

    public Motocicleta(String marca, String modelo, double precio,
                       int cilindrada, Bateria bateria) {

        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
        this.bateria = bateria;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Bateria getBateria() {
        return bateria;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Bateria: " + bateria.getTamanio());
        System.out.println("Capacidad: " + bateria.getCapacidad());
    }
}
