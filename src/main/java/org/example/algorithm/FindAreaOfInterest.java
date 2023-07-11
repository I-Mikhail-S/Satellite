package org.example.algorithm;

import org.example.entities.Satellite;
import org.example.entities.Station;
import org.example.specifications.Purpose;
import org.example.specifications.Schedule;

import java.util.Iterator;
import java.util.List;

public class FindAreaOfInterest {

    public void findAreaOfInterest(List<Satellite> allSatellite) {
        for (Satellite helpSatellite : allSatellite) {
            Schedule correctSchedule = new Schedule();
            Schedule ideaSchedule = new Schedule();
            int maxDataSizeForOneStation = 0;

            for (int i = 0; i < helpSatellite.getSchedule().getAllPurpose().size(); i++) {
                if (!helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea().isFlag()) {
                    ideaSchedule.addPurpose(helpSatellite.getSchedule().getAllPurpose().get(i));
                    helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea().setFlag(true);
                }
                if (helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea() instanceof Station) {
                    maxDataSizeForOneStation = ((Station) helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea()).getDataSize().getGigabyte();
                    for (int j = 0; ideaSchedule.getDataSize().getGigabyte() > maxDataSizeForOneStation; j++) {
                        ideaSchedule.getAllPurpose().remove(j);
                    }
                }
            }
        }

    }







}






/*
                for (Purpose helpPurpose : helpSatellite.getSchedule().getAllPurpose()) {
                if (helpPurpose.getStationOrArea() instanceof Station) {
                    maxDataSizeForOneStation = helpPurpose.getDataSize().getGigabyte();
                }
            }
            for (Purpose helpPurpose : helpSatellite.getSchedule().getAllPurpose()) {
                if (helpPurpose.getStationOrArea() instanceof Station) {
                    break;
                }
                if (ideaSchedule.getDataSize().getGigabyte() <= maxDataSizeForOneStation &&
                        !helpPurpose.getStationOrArea().isFlag()) {
                    ideaSchedule.addPurpose(helpPurpose);
                    helpPurpose.getStationOrArea().setFlag(true);
                    helpSatellite.getSchedule().getAllPurpose().remove(helpPurpose);
                }
            }
            Iterator<Purpose> iterator = helpSatellite.getSchedule().getAllPurpose().iterator();
            Purpose helpPurpose;
            while (iterator.hasNext()) {
                helpPurpose = iterator.next();
                if (!helpPurpose.getStationOrArea().isFlag()) {
                    helpSatellite.getSchedule().getAllPurpose().remove(helpPurpose);
                }
                if (helpPurpose.getStationOrArea() instanceof Station){
                    helpSatellite.getSchedule().getAllPurpose().remove(helpPurpose);
                    break;
                }
            }
    */

