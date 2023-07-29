package org.example.entities;

import org.example.specifications.DataSize;

// Наземная станция, приёмник
public class Station extends AbstractPointOnMap {
    private DataSize dataSize; // количество данных, которое станция примет за сеанс связи

    public Station(int id) {
        super(id); // Moscow - 1; Ekaterinburg - 2; Ulan-Ude - 3
        this.dataSize = new DataSize(0);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    public boolean isFlag() { // потенциальное место доработки
        return true; // в алгоритме не будет проходить проверку на посещённость точки
    }

    public DataSize getDataSize() {
        return dataSize;
    }

    public void setDataSize(DataSize dataSize) {
        this.dataSize = dataSize;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id='" + getId() + '\'' +
                ", dataSize=" + dataSize +
                '}';
    }
}
