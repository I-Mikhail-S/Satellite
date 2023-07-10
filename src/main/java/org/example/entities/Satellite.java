package org.example.entities;

import org.example.specifications.DataSize;
import org.example.specifications.Schedule;
import org.example.specifications.TimeInterval;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Спутники
public class Satellite {
    private int id;
    private DataSize dataSize; // количество данных, хранимых на спутнике
    private Schedule schedule;

    public Satellite () {
    }

    public Satellite(int id) {
        this.id = id;
        this.dataSize = new DataSize(0);
        this.schedule = new Schedule();
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

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "id=" + id +
                ", dataSize=" + dataSize +
                '}';
    }
}
