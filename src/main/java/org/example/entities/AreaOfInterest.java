package org.example.entities;

import org.example.specifications.DataSize;

public class AreaOfInterest  extends AbstractPointOnMap {
    public static final DataSize dataSize = new DataSize(1);

    public AreaOfInterest(int id) {
        super(id);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public boolean isFlag() {
        return super.isFlag();
    }

    @Override
    public void setFlag(boolean flag) {
        super.setFlag(flag);
    }

    public DataSize getDataSize() {
        return dataSize;
    }

    @Override
    public String toString() {
        return "AreaOfInterest{" +
                "id=" + getId() +
                '}';
    }
}
