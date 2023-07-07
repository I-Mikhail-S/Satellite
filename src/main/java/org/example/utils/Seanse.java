package org.example.utils;

import java.util.List;

class Seanse {
    public String name;
    public String locate;
    public String metro;
    public List<Session> sessions;

    @Override
    public String toString() {
        return "Seanse{" +
                "name='" + name + '\'' +
                ", locate='" + locate + '\'' +
                ", metro='" + metro + '\'' +
                ", sessions=" + sessions +
                '}';
    }
}