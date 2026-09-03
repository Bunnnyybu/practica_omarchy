# Sistema de Gestión de Vehículos de una Concesionaria

## Objetivo

Desarrollar un sistema orientado a objetos en Java para representar vehículos de una concesionaria, aplicando encapsulamiento, herencia, composición, clases abstractas y polimorfismo.

## Tecnologías utilizadas

- Java
- Maven
- NetBeans
- Git y GitHub

## Arquitectura del proyecto

### Vehiculo

Clase base que contiene los atributos comunes `marca`, `modelo` y `precio`.

### Motocicleta

Hereda de `Vehiculo` e incorpora la `cilindrada` y un objeto de tipo `Bateria`.

### Automovil

Hereda de `Vehiculo` e incorpora el número de puertas y un objeto de tipo `Bateria`.

### Bateria

Representa la batería asociada a los vehículos mediante composición.

### Garaje

Mantiene una lista de objetos `Vehiculo` y permite calcular el valor total de los vehículos almacenados.

### Cliente

Clase abstracta que contiene el nombre del cliente y declara el método abstracto `calcularDescuento()`.

### ClienteMayorista

Hereda de `Cliente` y sobrescribe `calcularDescuento()`, aplicando un descuento del 20 %.

### ClienteMinorista

Hereda de `Cliente` y sobrescribe `calcularDescuento()`, aplicando un descuento del 5 %.

## Conceptos aplicados

**Encapsulamiento:** Los atributos se mantienen privados y se accede a ellos mediante métodos públicos.

**Herencia:** `Motocicleta` y `Automovil` heredan de `Vehiculo`. `ClienteMayorista` y `ClienteMinorista` heredan de `Cliente`.

**Composición:** `Motocicleta` y `Automovil` contienen objetos de tipo `Bateria`.

**Clase abstracta:** `Cliente` establece una estructura común y declara `calcularDescuento()` como método abstracto.

**Polimorfismo:** Los objetos `ClienteMayorista` y `ClienteMinorista` pueden tratarse mediante referencias de tipo `Cliente` y ejecutar diferentes implementaciones de `calcularDescuento()`.

## Ejecución

El programa crea una motocicleta y un automóvil, los agrega al garaje, muestra sus datos, calcula el valor total de los vehículos y demuestra el cálculo de descuentos para clientes mayoristas y minoristas.
