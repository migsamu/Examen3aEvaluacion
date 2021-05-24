package org.iesfm.examen3.ej3;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(1,"green","124ghj",5,"gasoil");

        vehicle.run(123);
        vehicle.showInfo();
        System.out.println(vehicle.getKms());
    }
}
