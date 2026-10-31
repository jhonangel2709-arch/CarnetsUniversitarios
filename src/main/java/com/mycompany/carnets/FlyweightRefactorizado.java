package com.mycompany.carnets;

import java.util.HashMap;
import java.util.Map;

class DisenoCarnetCompartido {
    private final String color;
    private final byte[] logo;

    public DisenoCarnetCompartido(String color) {
        this.color = color;
        this.logo = new byte[50000];
    }

    public String getColor() {
        return color;
    }

    public int getBytesLogo() {
        return logo.length;
    }
}

class FabricaDisenos {
    private static final Map<String, DisenoCarnetCompartido> cache =
            new HashMap<>();

    public static DisenoCarnetCompartido obtener(String color) {
        if (!cache.containsKey(color)) {
            cache.put(color, new DisenoCarnetCompartido(color));
        }
        return cache.get(color);
    }

    public static int cantidad() {
        return cache.size();
    }
}

class CarnetConFlyweight {
    private final String nombre;
    private final DisenoCarnetCompartido diseno;

    public CarnetConFlyweight(String nombre, DisenoCarnetCompartido diseno) {
        this.nombre = nombre;
        this.diseno = diseno;
    }

    public DisenoCarnetCompartido getDiseno() {
        return diseno;
    }

    public void mostrar() {
        System.out.println(nombre + " - " + diseno.getColor());
    }
}

public class FlyweightRefactorizado {
    public static void main(String[] args) {
        DisenoCarnetCompartido d1 = FabricaDisenos.obtener("Azul");
        DisenoCarnetCompartido d2 = FabricaDisenos.obtener("Azul");
        DisenoCarnetCompartido d3 = FabricaDisenos.obtener("Azul");

        CarnetConFlyweight carnet1 = new CarnetConFlyweight("Ana", d1);
        CarnetConFlyweight carnet2 = new CarnetConFlyweight("Carlos", d2);
        CarnetConFlyweight carnet3 = new CarnetConFlyweight("Maria", d3);

        carnet1.mostrar();
        carnet2.mostrar();
        carnet3.mostrar();
        System.out.println("¿Comparten el mismo diseño? " +
                (carnet1.getDiseno() == carnet2.getDiseno()));
        System.out.println("Diseños creados: " + FabricaDisenos.cantidad());
        System.out.println("Bytes simulados de logos: " +
                (FabricaDisenos.cantidad() * d1.getBytesLogo()));
    }
}
