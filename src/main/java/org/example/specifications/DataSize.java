package org.example.specifications;

public class DataSize {
    private int gigabyte;
    public static final double speedSendDate = 0.25; // Гбайт/сек

    public DataSize(int gigabyte) {
        this.gigabyte = gigabyte;
    }

    public int getGigabyte() {
        return gigabyte;
    }

    public void setGigabyte(int gigabyte) {
        this.gigabyte = gigabyte;
    }

    @Override
    public String toString() {
        return "DataSize{" +
                "gigabyte=" + gigabyte +
                '}';
    }
}
