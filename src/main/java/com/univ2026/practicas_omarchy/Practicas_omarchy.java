/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.univ2026.practicas_omarchy;
import com.univ2026.practicas_omarchy.modelos.*;

/**
 *
 * @author victor
 */
public class Practicas_omarchy {

    public static void main(String[] args) {

        
        Bateria bateria1 = new Bateria("Grande", 80);
        Bateria bateria2 = new Bateria("Mediana", 60);

        
        Motocicleta moto1 = new Motocicleta(
                "Yamaha",
                "MT-07",
                8500.00,
                689,
                bateria1
        );

        
        Automovil auto1 = new Automovil(
                "Mazda",
                "CX-5",
                32000.00,
                5,
                bateria2
        );

        
        Garaje garaje1 = new Garaje();

       
        garaje1.agregarVehiculo(moto1);
        garaje1.agregarVehiculo(auto1);

        
        System.out.println("---- MOTOCICLETA ----");
        moto1.mostrarInformacion();

        System.out.println();

        System.out.println("---- AUTOMOVIL ----");
        auto1.mostrarInformacion();

        System.out.println();

        
        System.out.println(
                "Valor total de los vehiculos en el garaje: $"
                + garaje1.calcularValorTotal()
        );
    }
}