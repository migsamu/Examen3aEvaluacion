package org.iesfm.examen3.ej3;

import java.util.Objects;

public class Motorcicle extends Vehicle {

    private int cc;

    public Motorcicle(int kms, String colour, String plate, int cc) {
        super(kms, colour, plate);
        this.cc = cc;
    }

    @Override
    protected void showSpecificInfo() {
        System.out.println("La cilindrada es: " + cc);
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcicle that = (Motorcicle) o;
        return cc == that.cc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cc);
    }
}
