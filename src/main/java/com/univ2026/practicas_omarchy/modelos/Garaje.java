/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ2026.practicas_omarchy.modelos;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class Garaje {

    private List<Vehiculo> vehiculos;

    public Garaje() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public double calcularValorTotal() {

        double total = 0;

        for (Vehiculo vehiculo : vehiculos) {
            total += vehiculo.getPrecio();
        }

        return total;
    }
}
