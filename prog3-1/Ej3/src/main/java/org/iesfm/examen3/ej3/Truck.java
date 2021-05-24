package org.iesfm.examen3.ej3;

import java.util.Objects;

public class Truck extends Vehicle {

    private int maxWeight;

    public Truck(int kms, String colour, String plate, int maxWeight) {
        super(kms, colour, plate);
        this.maxWeight = maxWeight;
    }

    @Override
    protected void showSpecificInfo() {
        System.out.println("Peso maxsimo permitido" + maxWeight);
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return maxWeight == truck.maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxWeight);
    }
}
