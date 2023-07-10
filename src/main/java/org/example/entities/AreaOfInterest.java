package org.example.entities;

import org.example.specifications.DataSize;
import org.example.specifications.TimeInterval;

public class AreaOfInterest implements StationAndAreaOfInterest {
    private int id;
    public static final DataSize dataSize = new DataSize(1);

    public AreaOfInterest(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "AreaOfInterest{" +
                "id=" + id +
                '}';
    }
}
