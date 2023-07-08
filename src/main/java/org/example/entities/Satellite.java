package org.example.entities;

import org.example.specifications.DataSize;
import org.example.specifications.TimeInterval;

// Спутники
public class Satellite {
    private int id;
    private DataSize dataSize;
    private TimeInterval timeInterval;

    public Satellite () {
    }

    public Satellite(int id, TimeInterval timeInterval) {
        this.id = id;
        this.timeInterval = timeInterval;
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
                ", dataSize=" + dataSize +
                ", time=" + timeInterval +
                '}';
    }
}
