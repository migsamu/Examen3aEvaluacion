package org.iesfm.examen3.ej3;

import java.util.Objects;

public class Car extends Vehicle {

    private int numberPassengers;
    private String tipeFuel;

    public Car(int kms, String colour, String plate, int numberPassengers, String tipeFuel) {
        super(kms, colour, plate);
        this.numberPassengers = numberPassengers;
        this.tipeFuel = tipeFuel;
    }

    @Override
    protected void showSpecificInfo() {
        System.out.println("Número de plazas: " + numberPassengers);
        System.out.println("Combustible: " + tipeFuel);
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public String getTipeFuel() {
        return tipeFuel;
    }

    public void setTipeFuel(String tipeFuel) {
        this.tipeFuel = tipeFuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberPassengers == car.numberPassengers && Objects.equals(tipeFuel, car.tipeFuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberPassengers, tipeFuel);
    }
}
