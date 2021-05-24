package org.iesfm.examen3.ej4;

import java.util.List;
import java.util.Objects;

public class Almacen<T> {

    private String name;
    private List<T> plantaBaja;
    private List<T> plantaAlta;

    public Almacen(String name, List<T> plantaBaja, List<T> plantaAlta) {
        this.name = name;
        this.plantaBaja = plantaBaja;
        this.plantaAlta = plantaAlta;
    }

    public void addElement(T value) {
        plantaBaja.add(value);
    }

    public T getFirstElement() {
        return plantaAlta.get(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getPlantaBaja() {
        return plantaBaja;
    }

    public void setPlantaBaja(List<T> plantaBaja) {
        this.plantaBaja = plantaBaja;
    }

    public List<T> getPlantaAlta() {
        return plantaAlta;
    }

    public void setPlantaAlta(List<T> plantaAlta) {
        this.plantaAlta = plantaAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Almacen<?> almacen = (Almacen<?>) o;
        return Objects.equals(name, almacen.name) && Objects.equals(plantaBaja, almacen.plantaBaja) && Objects.equals(plantaAlta, almacen.plantaAlta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, plantaBaja, plantaAlta);
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "name='" + name + '\'' +
                ", plantaBaja=" + plantaBaja +
                ", plantaAlta=" + plantaAlta +
                '}';
    }
}
