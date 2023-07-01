package org.example.entities;

import org.example.specifications.Location;
import org.example.specifications.TimeInterval;

// агент спутника
public class AgentSatellite extends Satellite{
    private int id;

    public AgentSatellite() {
    }

    public AgentSatellite(int id, Location location, TimeInterval timeInterval) {
        super(id, location, timeInterval);
        this.id = 1;
        //new Thread();
    }
}
