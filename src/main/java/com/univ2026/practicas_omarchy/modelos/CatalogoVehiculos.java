/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ2026.practicas_omarchy.modelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


/**
 *
 * @author victor
 */
public class CatalogoVehiculos {
     private ArrayList<Vehiculo> vehiculos;
     private HashMap<String, Vehiculo> vehiculosPorClave;
     private HashSet<String> clavesRegistradas;

    public CatalogoVehiculos() {
        vehiculos = new ArrayList<>();
        vehiculosPorClave = new HashMap<>();
        clavesRegistradas = new HashSet<>();
    }
    
    private String generarClave(String marca, String modelo) {
        return (marca.trim() + "-" + modelo.trim()).toLowerCase();
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {

        String clave = generarClave(
                vehiculo.getMarca(),
                vehiculo.getModelo()
        );

        if (clavesRegistradas.contains(clave)) {
            return false;
        }

        vehiculos.add(vehiculo);
        vehiculosPorClave.put(clave, vehiculo);
        clavesRegistradas.add(clave);

        return true;
    }

    public Vehiculo buscarVehiculo(String marca, String modelo) {

        String clave = generarClave(marca, modelo);

        return vehiculosPorClave.get(clave);
    }

    public ArrayList<Vehiculo> listarVehiculos() {

        return new ArrayList<>(vehiculos);
    }

    public boolean actualizarVehiculo(
            String marcaActual,
            String modeloActual,
            String nuevaMarca,
            String nuevoModelo,
            double nuevoPrecio) {

        String claveActual = generarClave(
                marcaActual,
                modeloActual
        );

        Vehiculo vehiculo = vehiculosPorClave.get(claveActual);

        if (vehiculo == null) {
            return false;
        }

        String nuevaClave = generarClave(
                nuevaMarca,
                nuevoModelo
        );

        if (!claveActual.equals(nuevaClave)
                && clavesRegistradas.contains(nuevaClave)) {

            return false;
        }

        vehiculo.setMarca(nuevaMarca);
        vehiculo.setModelo(nuevoModelo);
        vehiculo.setPrecio(nuevoPrecio);

        if (!claveActual.equals(nuevaClave)) {

            vehiculosPorClave.remove(claveActual);
            clavesRegistradas.remove(claveActual);

            vehiculosPorClave.put(nuevaClave, vehiculo);
            clavesRegistradas.add(nuevaClave);
        }

        return true;
    }

    public boolean eliminarVehiculo(String marca, String modelo) {

        String clave = generarClave(marca, modelo);

        Vehiculo vehiculo = vehiculosPorClave.remove(clave);

        if (vehiculo == null) {
            return false;
        }

        vehiculos.remove(vehiculo);
        clavesRegistradas.remove(clave);

        return true;
    }
    
    
    
}
