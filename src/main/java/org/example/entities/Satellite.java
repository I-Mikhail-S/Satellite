package org.example.entities;

import org.example.specifications.DataSize;
import org.example.specifications.Location;
import org.example.specifications.TimeInterval;

// Спутники
public class Satellite {
    private int id;
    private Location location;
    private int speed;
    private DataSize dataSize;
    private TimeInterval timeInterval; // пока что не совсем понятно куда это
    private AgentSatellite agentSatellite;

    public Satellite () {
    }

    public Satellite(int id, Location location, TimeInterval timeInterval) {
        this.id = id;
        this.location = location;
        this.speed = 3000; // км/ч
        this.dataSize = new DataSize(0);
        this.timeInterval = timeInterval;
        this.agentSatellite = new AgentSatellite();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public DataSize getDataSize() {
        return dataSize;
    }

    public void setDataSize(DataSize dataSize) {
        this.dataSize = dataSize;
    }

    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "id=" + id +
                ", location=" + location +
                ", speed=" + speed +
                ", dataSize=" + dataSize +
                ", time=" + timeInterval +
                '}';
    }
}
