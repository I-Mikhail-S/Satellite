package org.example.specifications;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Purpose> allPurpose;

    public Schedule(List<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
    }

    public Schedule() {
        allPurpose = new ArrayList<>();
    }

    public void addPurpose(Purpose purpose) {
        allPurpose.add(purpose);
    }

    public List<Purpose> getAllPurpose() {
        return allPurpose;
    }

    public void setAllPurpose(List<Purpose> allPurpose) {
        this.allPurpose = allPurpose;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "allPurpose=" + allPurpose +
                '}';
    }
}
