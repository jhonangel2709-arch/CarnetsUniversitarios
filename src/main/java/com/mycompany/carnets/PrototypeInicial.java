package com.mycompany.carnets;

import java.util.ArrayList;
import java.util.List;

class CarnetConfiguradoAMano {
    private final String titular;
    private final List<String> permisos;

    public CarnetConfiguradoAMano(String titular) {
        this.titular = titular;
        this.permisos = new ArrayList<>();
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

public class PrototypeInicial {
    public static void main(String[] args) {
        CarnetConfiguradoAMano ana = new CarnetConfiguradoAMano("Ana");
        ana.agregarPermiso("Biblioteca");
        ana.agregarPermiso("Laboratorio");
        ana.agregarPermiso("Gimnasio");

        CarnetConfiguradoAMano luis = new CarnetConfiguradoAMano("Luis");
        luis.agregarPermiso("Biblioteca");
        luis.agregarPermiso("Laboratorio");
        luis.agregarPermiso("Gimnasio");

        CarnetConfiguradoAMano sara = new CarnetConfiguradoAMano("Sara");
        sara.agregarPermiso("Biblioteca");
        sara.agregarPermiso("Laboratorio");
        sara.agregarPermiso("Gimnasio");

        ana.quitarPermiso("Laboratorio");
        ana.mostrar();
        luis.mostrar();
        sara.mostrar();
    }
}
