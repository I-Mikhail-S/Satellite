package org.example.specifications;

import org.example.entities.AreaOfInterest;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Purpose> allPurpose;
    private DataSize dataSize;

    public Schedule(List<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
        this.dataSize = new DataSize(countAllDataSize(allPurpose));
    }

    public Schedule() {
        allPurpose = new ArrayList<>();
        dataSize = new DataSize(0);
    }

    public void addPurpose(Purpose purpose) {
        allPurpose.add(purpose);
        dataSize.setGigabyte(countAllDataSize(allPurpose));
    }

    public void addAllPurpose(List<Purpose> purposeList) {
        allPurpose.addAll(purposeList);
        dataSize.setGigabyte(countAllDataSize(allPurpose));
    }

    public void addAllPurpose(Schedule schedule) {
        allPurpose.addAll(schedule.getAllPurpose());
        dataSize.setGigabyte(countAllDataSize(allPurpose));
    }

    public int countAllDataSize(List<Purpose> purposeList) {
        int newDataSize = 0;
        for (Purpose helpPurpose : purposeList) {
            if (helpPurpose.getStationOrArea() instanceof AreaOfInterest) {
                newDataSize += helpPurpose.getDataSize().getGigabyte();
            }
        }
        return newDataSize;
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
        return "Schedule{ " + allPurpose +
                ", dataSize=" + dataSize +
                '}';
    }
}
