package org.example.entities;


import org.example.specifications.DataSize;
import org.example.specifications.Location;
import org.example.specifications.TimeInterval;

// Наземная станция, приёмник
public class Station {
    private String name;
    private Location location;
    private TimeInterval timeInterval;
    private DataSize dataSize;

    public Station() {
    }

    public Station(String name, Location location, TimeInterval timeInterval) {
        this.name = name;
        this.location = location;
        this.timeInterval = timeInterval;
        this.dataSize = new DataSize(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
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
                "name='" + name + '\'' +
                ", location=" + location +
                ", timeInterval=" + timeInterval +
                ", dataSize=" + dataSize +
                '}';
    }
}
