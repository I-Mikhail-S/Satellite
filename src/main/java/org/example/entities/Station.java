package org.example.entities;


import org.example.specifications.DataSize;
import org.example.specifications.TimeInterval;

// Наземная станция, приёмник
public class Station implements StationAndAreaOfInterest{
    private int id; // Moscow - 1; Ekaterinburg - 2; Ulan-Ude - 3
    private DataSize dataSize;

    public Station() {
    }

    public Station(int id) {
        this.id = id;
        this.dataSize = new DataSize(0);
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

    @Override
    public String toString() {
        return "Station{" +
                "id='" + id + '\'' +
                ", dataSize=" + dataSize +
                '}';
    }
}
