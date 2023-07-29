package org.example.entities;

import org.example.specifications.DataSize;
import org.example.specifications.Schedule;

import java.util.Objects;

// Спутники
public class Satellite {
    private int id;
    private DataSize dataSize; // количество данных, хранимых на спутнике
    private Schedule schedule;

    public Satellite () {
    }

    public Satellite(int id) {
        this.id = id;
        this.dataSize = new DataSize(0);
        this.schedule = new Schedule();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DataSize getDataSize() {
        return dataSize;
    }

    public void setDataSize(DataSize dataSize) {
        this.dataSize = dataSize;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Satellite satellite = (Satellite) o;
        return id == satellite.id && Objects.equals(dataSize, satellite.dataSize) && Objects.equals(schedule, satellite.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataSize, schedule);
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "id=" + id +
                ", dataSize=" + dataSize +
                ", schedule=" + schedule +
                '}';
    }
}
