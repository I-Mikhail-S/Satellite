package org.example.entities;

import org.example.specifications.DataSize;

public class AreaOfInterest implements StationAndAreaOfInterest {
    private int id;
    private boolean flag; // точка была сфотографирована
    public static final DataSize dataSize = new DataSize(1);

    public AreaOfInterest(int id) {
        this.id = id;
        flag = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean isFlag() {
        return flag;
    }

    @Override
    public void setFlag(boolean flag) {
        this.flag = flag;
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
