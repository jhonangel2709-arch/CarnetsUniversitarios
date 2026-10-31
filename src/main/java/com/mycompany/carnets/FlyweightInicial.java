package com.mycompany.carnets;

class CarnetSinFlyweight {
    private final String nombre;
    private final String color;
    private final byte[] logo;

    public CarnetSinFlyweight(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.logo = new byte[50000];
    }

    public byte[] getLogo() {
        return logo;
    }

    public void mostrar() {
        System.out.println(nombre + " - " + color);
    }
}

public class FlyweightInicial {
    public static void main(String[] args) {
        CarnetSinFlyweight carnet1 = new CarnetSinFlyweight("Ana", "Azul");
        CarnetSinFlyweight carnet2 = new CarnetSinFlyweight("Carlos", "Azul");
        CarnetSinFlyweight carnet3 = new CarnetSinFlyweight("Maria", "Azul");

        carnet1.mostrar();
        carnet2.mostrar();
        carnet3.mostrar();
        System.out.println("¿Comparten el mismo logo? " +
                (carnet1.getLogo() == carnet2.getLogo()));
        System.out.println("Bytes simulados de logos: " + (3 * 50000));
    }
}
