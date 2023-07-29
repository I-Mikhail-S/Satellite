package org.example.algorithm;

import org.example.entities.AreaOfInterest;
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
            int maxDataSizeForOneStation;
            Schedule ideaSchedule = new Schedule();
            for (int i = 0; i < helpSatellite.getSchedule().getAllPurpose().size(); i++) {

                if (ideaSchedule.getAllPurpose().size() == 0) {
                    ideaSchedule.addPurpose(helpSatellite.getSchedule().getAllPurpose().get(i));
                    if (helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea() instanceof AreaOfInterest) {
                        helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea().setFlag(true);
                    }
                }

                if (!helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea().isFlag()) {
/*                    if (ideaSchedule.getAllPurpose().size() == 0) {
                        ideaSchedule.addPurpose(helpSatellite.getSchedule().getAllPurpose().get(i));
                        helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea().setFlag(true);
                    }*/
                    if (ideaSchedule.getAllPurpose().get(ideaSchedule.getAllPurpose().size() - 1).getTimeInterval().getFinish().getDate()
                            .before(helpSatellite.getSchedule().getAllPurpose().get(i).getTimeInterval().getStart().getDate())) {
                        ideaSchedule.addPurpose(helpSatellite.getSchedule().getAllPurpose().get(i));
                        helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea().setFlag(true);
                    }
                }

                if (helpSatellite.getSchedule().getAllPurpose().get(i).getStationOrArea() instanceof Station) {
                    if (ideaSchedule.getAllPurpose().size() == 0) {
                        ideaSchedule.addPurpose(helpSatellite.getSchedule().getAllPurpose().get(i));
                    } else {
                        if (ideaSchedule.getAllPurpose().get(ideaSchedule.getAllPurpose().size() - 1).getTimeInterval().getFinish().getDate()
                                .after(helpSatellite.getSchedule().getAllPurpose().get(i).getTimeInterval().getStart().getDate())) {
                            ideaSchedule.getAllPurpose().get(ideaSchedule.getAllPurpose().size() - 1).getStationOrArea().setFlag(false);
                            ideaSchedule.getAllPurpose().remove(ideaSchedule.getAllPurpose().size() - 1);
                        }
                        maxDataSizeForOneStation = helpSatellite.getSchedule().getAllPurpose().get(i).getDataSize().getGigabyte();
                        Iterator<Purpose> iterator = ideaSchedule.getAllPurpose().iterator();
                        if (iterator.hasNext()) {
                            iterator.next();
                            while (iterator.hasNext() && ideaSchedule.getDataSize().getGigabyte() > maxDataSizeForOneStation) {
                                iterator.remove();
                                iterator.next().getStationOrArea().setFlag(false);
                            }
                        }
                        correctSchedule.getAllPurpose().addAll(ideaSchedule.getAllPurpose());
                        ideaSchedule.getAllPurpose().removeAll(ideaSchedule.getAllPurpose());
                    }
                }
            }
            helpSatellite.setSchedule(correctSchedule);
        }

    }

}