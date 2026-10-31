# Carnets Universitarios

Proyecto de Programación III desarrollado en Java para demostrar el funcionamiento de los patrones de diseño Flyweight y Prototype mediante un sistema sencillo de carnets universitarios.

## Descripción del proyecto

Nuestro programa simula la creación de carnets para estudiantes universitarios.

Implementamos dos patrones de diseño:

- Flyweight: permite que varios carnets compartan el mismo diseño y logotipo, evitando almacenar información repetida.
- Prototype: permite crear carnets nuevos copiando un modelo con permisos de Biblioteca, Laboratorio y Gimnasio.

Cada patrón tiene dos versiones: una inicial que presenta un problema de diseño y otra mejorada que aplica el patrón.


## Instrucciones de ejecución

1. En GitHub, seleccionar **Code → Download ZIP**.
2. Descomprimir el archivo descargado.
3. Abrir Apache NetBeans.
4. Seleccionar **File → Open Project**.
5. Buscar la carpeta `CarnetsUniversitarios` que contiene el archivo `pom.xml`.
6. Dentro de **Source Packages**, abrir `com.mycompany.carnets`.
7. Hacer clic derecho sobre el programa que se desea ejecutar y seleccionar **Run File** o presionar `Shift + F6`.

Cada programa tiene su propio método `main`, por lo que pueden ejecutarse individualmente.

## Archivos del proyecto

| Archivo | Descripción |
|---|---|
| `FlyweightInicial.java` | Cada carnet crea su propio logotipo simulado, duplicando información. |
| `FlyweightRefactorizado.java` | Se aplica Flyweight para compartir un diseño entre varios carnets. |
| `PrototypeInicial.java` | Los permisos se configuran manualmente para cada estudiante. |
| `PrototypeRefactorizado.java` | Se aplica Prototype para crear copias independientes de un carnet modelo. |

## Resultados esperados

**Flyweight inicial:** muestra `false` porque los carnets comparados tienen arreglos de logotipo diferentes.

**Flyweight refactorizado:** muestra `true` porque comparten el mismo objeto de diseño. Además, indica que solo se almacenó un diseño azul.

**Prototype inicial:** muestra los permisos configurados manualmente para cada estudiante.

**Prototype refactorizado:** muestra que los carnets pueden tener permisos diferentes y que Ana y Luis son objetos independientes (`false`).
