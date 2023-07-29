package org.example.specifications;

import org.example.entities.*;

public class Purpose implements Comparable<Purpose> {
    private Satellite satellite;
    private AbstractPointOnMap stationOrArea;
    private TimeInterval timeVisible;
    private DataSize dataSize;

    public Purpose(Satellite satellite, Station station, TimeInterval timeVisible) {
        this.satellite = satellite;
        this.stationOrArea = station;
        this.timeVisible = timeVisible;
        this.dataSize = new DataSize(calculationDataSizeFromTime(timeVisible));
    }

    public Purpose(Satellite satellite, AreaOfInterest area, TimeInterval timeVisible) {
        this.satellite = satellite;
        this.stationOrArea = area;
        this.timeVisible = timeVisible;
        this.dataSize = area.getDataSize();
    }

    public int calculationDataSizeFromTime(TimeInterval timeInterval) {
        return (int) (timeInterval.getTimeIntervalSecond() * DataSize.speedSendDate);
    }

    public Satellite getSatellite() {
        return satellite;
    }

    public void setSatellite(Satellite satellite) {
        this.satellite = satellite;
    }

    public AbstractPointOnMap getStationOrArea() {
        return stationOrArea;
    }

    public void setStationOrArea(AbstractPointOnMap stationOrArea) {
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
        if (this.getTimeInterval().getStart().getDate().after(purpose.getTimeInterval().getStart().getDate()))
            return 1;
        if (this.getTimeInterval().getStart().getDate().before(purpose.getTimeInterval().getStart().getDate()))
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
