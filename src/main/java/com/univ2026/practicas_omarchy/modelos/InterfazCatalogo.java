/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.univ2026.practicas_omarchy.modelos;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author victor
 */
public class InterfazCatalogo extends Application {

    private CatalogoVehiculos catalogo = new CatalogoVehiculos();

    private TextField campoMarca = new TextField();
    private TextField campoModelo = new TextField();
    private TextField campoPrecio = new TextField();

    private ListView<String> listaVehiculos = new ListView<>();

    private Label mensaje = new Label();

    @Override
    public void start(Stage ventana) {

        Label titulo = new Label("Catalogo de Vehiculos");

        campoMarca.setPromptText("Marca");
        campoModelo.setPromptText("Modelo");
        campoPrecio.setPromptText("Precio");

        Button botonCrear = new Button("Crear");
        Button botonConsultar = new Button("Consultar");
        Button botonActualizar = new Button("Actualizar");
        Button botonEliminar = new Button("Eliminar");

        botonCrear.setOnAction(evento -> crearVehiculo());

        botonConsultar.setOnAction(evento -> consultarVehiculo());

        botonActualizar.setOnAction(evento -> actualizarVehiculo());

        botonEliminar.setOnAction(evento -> eliminarVehiculo());

        HBox botones = new HBox(
                10,
                botonCrear,
                botonConsultar,
                botonActualizar,
                botonEliminar
        );

        VBox contenido = new VBox(
                10,
                titulo,
                campoMarca,
                campoModelo,
                campoPrecio,
                botones,
                mensaje,
                listaVehiculos
        );

        contenido.setPadding(new Insets(20));

        Scene escena = new Scene(contenido, 600, 450);

        ventana.setTitle("Concesionaria - Catalogo de Vehiculos");
        ventana.setScene(escena);
        ventana.show();
    }

    private void crearVehiculo() {

        try {

            String marca = campoMarca.getText();
            String modelo = campoModelo.getText();
            double precio = Double.parseDouble(campoPrecio.getText());

            if (precio < 0) {
                throw new IllegalArgumentException(
                        "El precio no puede ser negativo."
                );
            }

            Vehiculo vehiculo = new Vehiculo(
                    marca,
                    modelo,
                    precio
            );

            boolean agregado = catalogo.agregarVehiculo(vehiculo);

            if (agregado) {

                mensaje.setText(
                        "Vehiculo agregado correctamente."
                );

                refrescarLista();
                limpiarCampos();

            } else {

                mensaje.setText(
                        "Error: El vehiculo ya esta registrado."
                );
            }

        } catch (NumberFormatException error) {

            mensaje.setText(
                    "Error: El precio debe ser numerico."
            );

        } catch (IllegalArgumentException error) {

            mensaje.setText(
                    "Error: " + error.getMessage()
            );
        }
    }

    private void consultarVehiculo() {

        String marca = campoMarca.getText();
        String modelo = campoModelo.getText();

        if (marca.isBlank() || modelo.isBlank()) {

            mensaje.setText(
                    "Error: Ingrese la marca y el modelo."
            );

            return;
        }

        Vehiculo vehiculo = catalogo.buscarVehiculo(
                marca,
                modelo
        );

        if (vehiculo != null) {

            mensaje.setText(
                    "Vehiculo encontrado."
            );

            campoPrecio.setText(
                    String.valueOf(vehiculo.getPrecio())
            );

            listaVehiculos.getItems().clear();

            listaVehiculos.getItems().add(
                    vehiculo.getMarca()
                    + " - "
                    + vehiculo.getModelo()
                    + " - $"
                    + vehiculo.getPrecio()
            );

        } else {

            mensaje.setText(
                    "Error: Vehiculo no encontrado."
            );
        }
    }

    private void actualizarVehiculo() {

        try {

            String marca = campoMarca.getText();
            String modelo = campoModelo.getText();

            if (marca.isBlank() || modelo.isBlank()) {

                throw new IllegalArgumentException(
                        "Ingrese la marca y el modelo."
                );
            }

            double precio = Double.parseDouble(
                    campoPrecio.getText()
            );

            if (precio < 0) {

                throw new IllegalArgumentException(
                        "El precio no puede ser negativo."
                );
            }

            boolean actualizado
                    = catalogo.actualizarVehiculo(
                            marca,
                            modelo,
                            marca,
                            modelo,
                            precio
                    );

            if (actualizado) {

                mensaje.setText(
                        "Vehiculo actualizado correctamente."
                );

                refrescarLista();
                limpiarCampos();

            } else {

                mensaje.setText(
                        "Error: Vehiculo no encontrado."
                );
            }

        } catch (NumberFormatException error) {

            mensaje.setText(
                    "Error: El precio debe ser numerico."
            );

        } catch (IllegalArgumentException error) {

            mensaje.setText(
                    "Error: " + error.getMessage()
            );
        }
    }

    private void eliminarVehiculo() {

        String marca = campoMarca.getText();
        String modelo = campoModelo.getText();

        if (marca.isBlank() || modelo.isBlank()) {

            mensaje.setText(
                    "Error: Ingrese la marca y el modelo."
            );

            return;
        }

        boolean eliminado = catalogo.eliminarVehiculo(
                marca,
                modelo
        );

        if (eliminado) {

            mensaje.setText(
                    "Vehiculo eliminado correctamente."
            );

            refrescarLista();
            limpiarCampos();

        } else {

            mensaje.setText(
                    "Error: Vehiculo no encontrado."
            );
        }
    }

    private void refrescarLista() {

        listaVehiculos.getItems().clear();

        for (Vehiculo vehiculo : catalogo.listarVehiculos()) {

            listaVehiculos.getItems().add(
                    vehiculo.getMarca()
                    + " - "
                    + vehiculo.getModelo()
                    + " - $"
                    + vehiculo.getPrecio()
            );
        }
    }

    private void limpiarCampos() {

        campoMarca.clear();
        campoModelo.clear();
        campoPrecio.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
