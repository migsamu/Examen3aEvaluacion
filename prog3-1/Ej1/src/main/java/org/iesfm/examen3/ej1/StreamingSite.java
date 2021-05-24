package org.iesfm.examen3.ej1;

import java.util.Map;
import java.util.Objects;

public class StreamingSite {

    private String name;
    private Map<String, Canal> canals;

    public StreamingSite(String name, Map<String, Canal> canals) {
        this.name = name;
        this.canals = canals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Canal> getCanals() {
        return canals;
    }

    public void setCanals(Map<String, Canal> canals) {
        this.canals = canals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamingSite that = (StreamingSite) o;
        return Objects.equals(name, that.name) && Objects.equals(canals, that.canals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, canals);
    }

    @Override
    public String toString() {
        return "StreamingSite{" +
                "name='" + name + '\'' +
                ", canals=" + canals +
                '}';
    }
}
