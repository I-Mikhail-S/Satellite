package org.example.specifications;

import org.example.entities.AreaOfInterest;
import org.example.entities.Satellite;
import org.example.entities.StationAndAreaOfInterest;

public class Purpose implements Comparable<Purpose>{
    private Satellite satellite;
    private Object stationOrArea;
    private TimeInterval timeVisible;
    private DataSize dataSize;

    public Purpose(Satellite satellite, StationAndAreaOfInterest stationOrArea, TimeInterval timeVisible) {
        this.satellite = satellite;
        this.stationOrArea = stationOrArea;
        this.timeVisible = timeVisible;
        if (stationOrArea instanceof AreaOfInterest)
            this.dataSize = ((AreaOfInterest) stationOrArea).getDataSize();
        else
            this.dataSize = new DataSize((int) (timeVisible.getTimeIntervalSecond() * DataSize.speedSendDate));
    }

    public Satellite getSatellite() {
        return satellite;
    }

    public void setSatellite(Satellite satellite) {
        this.satellite = satellite;
    }

    public StationAndAreaOfInterest getStationOrArea() {
        return (StationAndAreaOfInterest) stationOrArea;
    }

    public void setStationOrArea(StationAndAreaOfInterest stationOrArea) {
        this.stationOrArea = stationOrArea;
    }

    public TimeInterval getTimeInterval() {
        return timeVisible;
    }

    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeVisible = timeInterval;
    }

    public DataSize getDataSize() {
        return dataSize;
    }

    public void setDataSize(DataSize dataSize) {
        this.dataSize = dataSize;
    }

    @Override
    public int compareTo(Purpose purpose) {
        if (this.getTimeInterval().getTimeStartSecond() > purpose.getTimeInterval().getTimeStartSecond())
            return 1;
        if (this.getTimeInterval().getTimeStartSecond() < purpose.getTimeInterval().getTimeStartSecond())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Purpose{" +
                ", stationOrArea=" + stationOrArea +
                ", timeInterval=" + timeVisible +
                '}';
    }
}
