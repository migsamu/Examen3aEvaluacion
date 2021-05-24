package org.iesfm.examen3.ej3;

import java.util.Objects;

public abstract class Vehicle {
    private int kms;
    private String colour;
    private String plate;

    public Vehicle(int kms, String colour, String plate) {
        this.kms = kms;
        this.colour = colour;
        this.plate = plate;
    }

    public void showInfo() {
        System.out.println("Número de kilometros: " + kms);
        System.out.println("Color: " + colour);
        System.out.println("Matrícula: " + plate);
        showSpecificInfo();
    }

    protected abstract void showSpecificInfo();

    public void run(int distance) {
        kms += distance;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return kms == vehicle.kms && Objects.equals(colour, vehicle.colour) && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kms, colour, plate);
    }
}
