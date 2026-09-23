# Catálogo de Vehículos - Semanas 5 y 6

Proyecto desarrollado en Java para la materia de Programación Estructurada.

El proyecto implementa un catálogo de vehículos utilizando colecciones y genéricos en Java, junto con una interfaz gráfica desarrollada con JavaFX.

## Semana 5 - Colecciones y genéricos

Para administrar el catálogo de vehículos se utilizan las siguientes colecciones:

- `ArrayList<Vehiculo>`
- `HashMap<String, Vehiculo>`
- `HashSet<String>`

El catálogo permite realizar las siguientes operaciones:

- Agregar vehículos.
- Buscar vehículos.
- Listar vehículos.
- Actualizar vehículos.
- Eliminar vehículos.
- Evitar registros duplicados.

La clase encargada de estas operaciones es:

```text
CatalogoVehiculos.java
```

## Semana 6 - Interfaz gráfica y manejo de eventos

La interfaz gráfica fue desarrollada utilizando JavaFX.

Desde la interfaz se pueden realizar las operaciones CRUD:

- Crear.
- Consultar.
- Actualizar.
- Eliminar.

También se realizan validaciones para controlar:

- Campos vacíos.
- Precios no numéricos.
- Precios negativos.
- Vehículos duplicados.
- Vehículos no encontrados.

La clase principal de la interfaz gráfica es:

```text
InterfazCatalogo.java
```

Los botones de la interfaz utilizan eventos mediante `setOnAction()` para ejecutar las operaciones correspondientes.

## Requisitos

Para ejecutar la aplicación se necesita:

- Java JDK 21.
- Maven.
- NetBeans o un IDE compatible con proyectos Maven.

## Instrucciones para ejecutar la aplicación

1. Descargar o clonar el repositorio.

2. Abrir el proyecto `practicas_omarchy` en NetBeans.

3. Esperar a que Maven descargue las dependencias configuradas en el archivo `pom.xml`.

4. Ejecutar la aplicación JavaFX utilizando el siguiente comando:

```bash
mvn javafx:run
```

También puede ejecutarse desde NetBeans utilizando una acción Maven con el siguiente objetivo:

```text
javafx:run
```

5. Al ejecutar la aplicación se abrirá la ventana:

```text
Concesionaria - Catalogo de Vehiculos
```

Desde esta ventana se pueden crear, consultar, actualizar y eliminar vehículos del catálogo.

## Autor

Víctor Cervantes