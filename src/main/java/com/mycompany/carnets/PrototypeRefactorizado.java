package com.mycompany.carnets;

import java.util.ArrayList;
import java.util.List;

interface PrototipoCarnet {
    CarnetPrototipo copiar();
}

class CarnetPrototipo implements PrototipoCarnet {
    private String titular;
    private final List<String> permisos;

    public CarnetPrototipo(String titular) {
        this.titular = titular;
        this.permisos = new ArrayList<>();
    }

    private CarnetPrototipo(CarnetPrototipo modelo) {
        this.titular = modelo.titular;
        this.permisos = new ArrayList<>(modelo.permisos);
    }

    @Override
    public CarnetPrototipo copiar() {
        return new CarnetPrototipo(this);
    }

    public void setTitular(String nuevoTitular) {
        this.titular = nuevoTitular;
    }

    public void agregarPermiso(String permiso) {
        permisos.add(permiso);
    }

    public void quitarPermiso(String permiso) {
        permisos.remove(permiso);
    }

    public void mostrar() {
        System.out.println(titular + " -> " + permisos);
    }
}

public class PrototypeRefactorizado {
    public static void main(String[] args) {
        CarnetPrototipo modelo = new CarnetPrototipo("MODELO");
        modelo.agregarPermiso("Biblioteca");
        modelo.agregarPermiso("Laboratorio");
        modelo.agregarPermiso("Gimnasio");

        CarnetPrototipo ana = modelo.copiar();
        ana.setTitular("Ana");
        ana.quitarPermiso("Laboratorio");

        CarnetPrototipo luis = modelo.copiar();
        luis.setTitular("Luis");

        CarnetPrototipo sara = modelo.copiar();
        sara.setTitular("Sara");

        modelo.mostrar();
        ana.mostrar();
        luis.mostrar();
        sara.mostrar();
        System.out.println("¿Ana y Luis son el mismo objeto? " + (ana == luis));
    }
}
