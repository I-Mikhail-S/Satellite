package org.example.specifications;

import org.example.entities.Station;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Purpose> allPurpose;
    private DataSize dataSize;

    public Schedule(List<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
        int dataSize = 0;
        for (Purpose helpVariable : allPurpose)
            if (helpVariable.getStationOrArea() instanceof Station)
                dataSize += helpVariable.getDataSize().getGigabyte();
        this.dataSize = new DataSize(dataSize);
    }

    public Schedule() {
        allPurpose = new ArrayList<>();
        dataSize = new DataSize(0);
    }

    public void addPurpose(Purpose purpose) {
        allPurpose.add(purpose);
        if (purpose.getStationOrArea() instanceof Station)
            this.dataSize.setGigabyte(dataSize.getGigabyte() + purpose.getDataSize().getGigabyte());
    }

    public List<Purpose> getAllPurpose() {
        return allPurpose;
    }

    public void setAllPurpose(List<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
    }

    public DataSize getDataSize() {
        return dataSize;
    }

    public void setDataSize(DataSize dataSize) {
        this.dataSize = dataSize;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "allPurpose=" + allPurpose +
                ", dataSize=" + dataSize +
                '}';
    }
}
